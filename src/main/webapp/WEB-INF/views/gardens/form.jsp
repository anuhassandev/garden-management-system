<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Garden Form</title>
</head>

<body>

<form:form action="/addGarden" modelAttribute="garden"> <%-- send the results as a model attribute "garden" (which we already made) to the model --%>

    <form:label path="id">Enter ID of the Garden:</form:label>
    <form:input path="id"/>
    <form:errors path="id"/>

    <form:label path="address">Enter address of the Garden:</form:label>
    <form:input path="address"/>
    <form:errors path="address"/>

    <form:label path="type">Enter type of the Garden:</form:label>
    <form:input path="type"/>
    <form:errors path="type"/>


    <input type="submit"/>
</form:form>
</body>

</html>