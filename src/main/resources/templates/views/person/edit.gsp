<html>
<head>
    <title>Spring Boot with Groovy</title>
</head>
<body>

<h1>Edit a Person</h1>
<ul>

    <form action="/person/save" method="post">
        <div class="form-group">
            <label for="id" class="label-control">Name:</label>
            <input type="text" name="id" id="id" value="${person.id}" class="form-control" readonly="readonly">
        </div>
        <div class="form-group">
            <label for="name" class="label-control">Name:</label>
            <input type="text" name="name" id="name" value="${person.name}" class="form-control">
        </div>
        <div class="form-group pull-right">
            <input type="submit"  value="Save" class="btn btn-success">
        </div>
    </form>
</ul>
</body>

</html>