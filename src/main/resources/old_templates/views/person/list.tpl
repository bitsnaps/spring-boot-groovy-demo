layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy',
    mainBody: contents {
        h1('List of Persons')
        p("Nbr of Persons: ${persons.size()}")
        ul {
            persons.each { person ->
                li {
                    p{
                        yield "${person.name}"
                        a(href: "/person/${person.id}", " Edit N°${person.id}")
                    }
                    form(action:"delete", method:"POST") {
                        input(type: "hidden", value: "${person.id}", name:"id", id:"id")
                        input(type:"submit", value:"Delete", class:"btn btn-danger")
                    }
                }

            }
        }
    }