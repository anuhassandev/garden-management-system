<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Garden List</title>
</head>

<body>
<c:forEach items="${gardens}" var="garden">
    <h2>Garden located at ${garden.getAddress()} is of type ${garden.getType()}</h2>
    <a href="/flowers?garden=${garden.getId()}">Click to see this garden's flowers</a>
</c:forEach>
<br><br>
<a href="/">Home</a>




</body>

</html>