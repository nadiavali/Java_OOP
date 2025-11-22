<%@ taglib prefix="c" uri="jakarta.tags.core" %>
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
    <form method="post">

        Description : <input type="text" name="desc">
        <input type="submit" class="btn btn-success">
    </form>

    <!-- jQuery + Bootstrap JS from WebJars -->
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
