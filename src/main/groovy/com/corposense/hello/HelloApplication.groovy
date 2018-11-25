package com.corposense.hello

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
@CompileStatic
class HelloApplication {

	@Autowired
	PersonRepository personRepository

	// Initialize App with some data
	@Bean
	def sendDatabase() {
		[
				new Person(id:1, name:"Ibrahim"),
				new Person(id:2, name:"Ali"),
				new Person(id:3, name:"Said")
		].each {
			personRepository.save(it)
		}
	}

	static void main(String[] args) {
		SpringApplication.run HelloApplication, args
	}
}
