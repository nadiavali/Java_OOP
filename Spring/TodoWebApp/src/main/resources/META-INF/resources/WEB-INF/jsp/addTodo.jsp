<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add TODO Page</title>

    <!-- Bootstrap CSS from WebJars -->
    <link rel="stylesheet"
          href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
</head>
<body class="container mt-4">

    <h1 class="mb-4">Your Todos</h1>
    <form:form method="post" modelAttribute="todo" action="/add-todo">

        Description : <form:input path="desc" required="required"/>
        <form:errors path="desc" cssClass="text-warning"/>
        <form:input  type="hidden" path="id" required="required"/>
        <form:input type="hidden" path="done" required="required"/>
        <input type="submit" class="btn btn-success">
    </form:form >

    <!-- jQuery + Bootstrap JS from WebJars -->
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
