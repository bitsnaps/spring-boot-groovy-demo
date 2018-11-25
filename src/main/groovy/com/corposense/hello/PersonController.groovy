package com.corposense.hello

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@CompileStatic
class PersonController {

    /**
     *
     * Query All Persons
     * curl localhost:8080/persons
     *
     * Add a Person
     * curl -X POST -d '{"id":1, "name":"Ibrahim"}' -H "Content-Type: application/json" localhost:8080/persons
     * curl -X POST -d '{"id":2, "name":"Ali"}' -H "Content-Type: application/json" localhost:8080/persons
     *
     * Update a Person
     * curl -X PUT -d '{"id":1, "name":"Kamel"}' -H "Content-Type: application/json" localhost:8080/persons
     *
     * Query a Person
     * curl localhost:8080/persons/2
     *
     * Delete a Person
     * curl -X DELETE localhost:8080/persons/1
     *
     */

    @Autowired
    PersonService personService

    @GetMapping('/persons')
    def getPersons(){
        personService.allPersons
    }

    @GetMapping('/persons/{id}')
    def getPerson(@PathVariable Long id){
        personService.getPerson(id)
    }

    @RequestMapping(value = '/persons', method = RequestMethod.POST)
    def addPerson(@RequestBody Person person){
        personService.savePerson(person)
    }

    @RequestMapping(value = '/persons', method = RequestMethod.PUT)
    def updatePerson(@RequestBody Person person){
        personService.savePerson(person)
    }

    @RequestMapping(value = '/persons/{id}', method = RequestMethod.DELETE)
    def removePerson(@PathVariable Long id){
        personService.removePerson(id)
    }

}
