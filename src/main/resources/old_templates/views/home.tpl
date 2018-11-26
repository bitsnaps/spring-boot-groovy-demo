layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy',
    mainBody: contents {
        h1('Welcome to Spring Boot with Groovy!')
        div("This App use Spring Boot with Groovy ${groovyVersion}")
        a(href:'/person/list', 'List of Persons')
    }
