layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy',
    mainBody: contents {
        h1("Edit Person N°${person.id}")
        form(action:"save", method:"POST") {
            div(class:"form-group"){
                label( "ID:")
                input(value:"${person.id}", name:"id", id:"id", readonly:"readonly", class:"form-control")
            }
            div(class:"form-group") {
                label("Name:")
                input(value: "${person.name}", name: "name", id: "name", class: "form-control")
            }
            div(class:"form-group pull-right") {
                input(type: "submit", value: "Save", class: "btn btn-success")
            }
        }

    }