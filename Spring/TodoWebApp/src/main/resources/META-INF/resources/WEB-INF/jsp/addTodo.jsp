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
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
</head>
<body class="container mt-4">

    <h1 class="mb-4">Your Todos</h1>
    <form:form method="post" modelAttribute="todo" action="/add-todo">
        <fieldset class="mb-4">
            <form:label path="desc"> Description</form:label>
            <form:input path="desc" required="required"/>
            <form:errors path="desc" cssClass="text-warning"/>
        </fieldset>

          <fieldset class="mb-4">
            <form:label path="targetDate"> Target Date</form:label>
            <form:input path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        
        <form:input  type="hidden" path="id" required="required"/>
        <form:input type="hidden" path="done" required="required"/>
        <input type="submit" class="btn btn-success">
    </form:form >

    <!-- jQuery + Bootstrap JS from WebJars -->
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        
    <script type="text/javascript">
        $('#targetDate').datepicker({
            format: 'yyyy-mm-dd'
	    });
    </script>
</body>
</html>
