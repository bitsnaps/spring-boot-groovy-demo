package com.corposense.hello

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@CompileStatic
class PersonService {

    @Autowired
    PersonRepository personRepository

    def getAllPersons(){
        personRepository.findAll()
//        Person.findAll()
    }

    def getPerson(Long id){
        personRepository.findOne(id)
//        Person.get(id)
    }

    def savePerson(Person p){
        personRepository.save(p)
//        p.save()
    }

    def removePerson(Long id){
        personRepository.delete(id)
//        def p = Person.get(id)
//        p.delete(flush: true)
    }

}
