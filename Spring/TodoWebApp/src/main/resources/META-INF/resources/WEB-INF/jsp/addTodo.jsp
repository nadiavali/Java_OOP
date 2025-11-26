<body class="container mt-4">
    <%@ include file="common/navigator.jspf" %>
    <%@ include file="common/header.jspf" %>
    <%@ include file="common/footer.jspf" %>

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
      <script type="text/javascript">
        $('#targetDate').datepicker({
            format: 'yyyy-mm-dd'
	    });
    </script>
</body>
