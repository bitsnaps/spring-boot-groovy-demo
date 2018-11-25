package com.corposense.hello

import grails.gsp.TagLib
import org.springframework.stereotype.Component

import java.text.SimpleDateFormat

@TagLib
@Component
class PersonTagLib {

    def dateFormat = { def attrs, def body ->
        out << new SimpleDateFormat(attrs.format).format(attrs.date)
    }
}
