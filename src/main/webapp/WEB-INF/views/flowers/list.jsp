<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Flowers List</title>
</head>

<body>
<c:forEach items="${flowers}" var="flower">
    <h2>This flower is of type ${flower.getName()} which comes from ${flower.getCountry()}, has petals that are ${flower.getPetals()} and has ${flower.getVarieties()} known variants.</h2>
</c:forEach>

<a href="/newFlower?garden=${garden}">Click here to add a flower to this garden</a>


</body>

</html>