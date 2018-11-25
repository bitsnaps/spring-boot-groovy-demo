package com.corposense.hello

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.Banner
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@Controller
@CompileStatic
class HelloController {

    @Autowired
    PersonService personService

    // for some reason this won't work anymore!
    @GetMapping('/')
    def hello(){
        'Hello Groovy!'
    }

    @RequestMapping('/home')
    def home(){
        new ModelAndView('views/home', [bootVersion: Banner.simpleName,
            groovyVersion: GroovySystem.version])
    }

    @RequestMapping('/person/list')
    def list(){
        new ModelAndView('views/person/list', [persons: personService.allPersons])
    }

    @RequestMapping('/person/{id}')
    def edit(@PathVariable Long id){
        new ModelAndView('views/person/edit', [person: personService.getPerson(id)])
    }

    @PostMapping(value = '/person/save')
    def save(@RequestParam Map<Long, String> map){
        personService.savePerson(new Person([id:map.id.toLong(), name: map.name]))
        redirectToList()
    }

    @PostMapping(value = '/person/delete')
    def delete(@RequestParam Long id){
        personService.removePerson(id)
        redirectToList()
    }

    private redirectToList(){
        new ModelAndView("redirect:/person/list")
    }



}
