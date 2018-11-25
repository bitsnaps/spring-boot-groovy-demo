package com.corposense.hello

import javax.persistence.Entity
import javax.persistence.Id

// In case we use GORM's Entity
//import grails.gorm.annotation.*

@Entity
class Person {
    @Id
    Long id
    String name

}
