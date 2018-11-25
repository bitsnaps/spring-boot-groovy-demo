package com.corposense.hello

import org.springframework.data.repository.CrudRepository

// Not used with GORM
interface PersonRepository extends CrudRepository<Person, Long>
{
}
