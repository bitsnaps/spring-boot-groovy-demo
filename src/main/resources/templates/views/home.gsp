<html>
    <head>
        <title>Spring Boot with Groovy</title>
    </head>
    <body>

        <h1>Welcome to Spring Boot with Groovy ${groovyVersion}!</h1>

        <!-- from PersonTagLib -->
        <p>Today: <g:dateFormat format="dd/MM/yyyy" date="${new Date()}" /></p>

        <a href="/person/list">List of Person</a>

    </body>

</html>