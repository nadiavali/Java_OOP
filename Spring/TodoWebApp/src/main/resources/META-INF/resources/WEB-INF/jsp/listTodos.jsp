<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Todos Page</title>

    <!-- Bootstrap CSS from WebJars -->
    <link rel="stylesheet"
          href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
</head>
<body class="container mt-4">

    <h1 class="mb-4">Your Todos</h1>

    <table class="table table-striped table-bordered">
        <thead class="table-light">
            <tr>
                <th>Id</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Done?</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning"> Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add TODO</a>

    <!-- jQuery + Bootstrap JS from WebJars -->
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
