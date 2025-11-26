<body class="container mt-4">
    <%@ include file="common/navigator.jspf" %>
    <%@ include file="common/header.jspf" %>
    <%@ include file="common/footer.jspf" %>
    
    <h1 class="mb-4">Your Todos</h1>

    <table class="table table-striped table-bordered">
        <thead class="table-light">
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th>Done?</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                   
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning"> Delete</a></td>
                    <td><a href="update-todo?id=${todo.id}" class=" btn btn-success"> Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add TODO</a>
</body>

