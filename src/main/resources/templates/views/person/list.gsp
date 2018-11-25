<html>
<head>
    <title>Spring Boot with Groovy</title>
</head>
<body>

<g:if test="${persons.size()}">
    <h2>Nbr of Persons:${persons.size()}</h2>
</g:if>
<g:else>
    <h4>There is person in the list.</h4>
</g:else>

<ul>
    <br>
    <g:each var="person" in="${persons}">
        <li>${person.name} <a href="/person/${person.id}">Edit N°${person.id}</a></li>
        <form action="/person/delete" method="post">
            <input type="hidden" name="id" value="${person.id}" />
            <input type="submit" class="btn btn-danger" value="Delete">
        </form>
    </g:each>
</ul>
</body>

</html>