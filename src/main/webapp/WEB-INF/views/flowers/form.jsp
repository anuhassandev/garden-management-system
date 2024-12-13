<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Flower Form</title>
</head>

<body>

<form:form action="/addFlower?garden=${garden}" modelAttribute="flower"> <%-- send the results as a model attribute "flower" to the model --%>

    <form:label path="name">Enter the name of the Flower:</form:label>
    <form:input path="name"/>
    <form:errors path="name"/>

    <form:label path="country">Enter country of the Flower:</form:label>
    <form:input path="country"/>
    <form:errors path="country"/>

    <form:label path="petals">Enter petal type of the Flower:</form:label>
    <form:input path="petals"/>
    <form:errors path="petals"/>

    <form:label path="varieties">Enter number of varieties of the Flower:</form:label>
    <form:input path="varieties"/>
    <form:errors path="varieties"/>


    <input type="submit"/>
</form:form>
</body>

</html>