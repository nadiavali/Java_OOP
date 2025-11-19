<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        h1 {
            color: #333;
        }
        form {
            margin-top: 20px;
        }
        input[type="text"],
        input[type="password"] {
            display: block;
            margin-bottom: 10px;
            padding: 8px;
            width: 250px;
        }
        input[type="submit"] {
            padding: 8px 16px;
            background-color: #007acc;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #005fa3;
        }
        pre {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <h1>Please Login:</h1>

    <form action="login" method="post">
        <pre>${error}</pre>
        Name: <input type="text" name="name">
        Password: <input type="password" name="password">
        <input type="submit" value="Login">
    </form>

</body>
</html>
