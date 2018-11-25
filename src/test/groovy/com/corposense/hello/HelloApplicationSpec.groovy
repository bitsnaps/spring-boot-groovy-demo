package com.corposense.hello

import spock.lang.Specification

// Spock  Tests

class HelloApplicationSpec extends Specification {

	void testHello(){
		given:
			def controller = new HelloController()
		when:
			def result = controller.hello()
		then:
			result == 'Hello Groovy!'
	}

}

/*

// JUnit Tests

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class HelloApplicationTests {
	@Test
	void contextLoads() {
	}
}
*/