yieldUnescaped '<!DOCTYPE HTML>'
html {
    head {
        title(pageTitle)
        link(rel:'stylesheet', href:'/css/bootstrap.min.css')
    }
    body {
        div(class: 'container'){
            div(class:'navbar'){
                h1('Spring Boot App')
            }
            div(class:'row'){
                div(class:'col-md-12'){
                    //yield 'use yield whenever you want to render a raw text'
                    mainBody()
                }

            }
        }
    }
}