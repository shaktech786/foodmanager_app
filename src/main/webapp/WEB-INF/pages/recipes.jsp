<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value='../../resources/css/recipes.css' ></c:url>" />
</head>
<body>
    <%@ include file="partials/_header.jsp" %>
    <h2>Recipes</h2>
    <p>With the following ingredients in your fridge: ${ingredientList}, you may be able to use these recipes. <br>Bon Appetit!</br></p>
    <ul>
        <li><a href="#">Butter Chicken</a></li>
        <li><a href="#">Lasagna</a></li>
        <li><a href="#">French Toast</a></li>
        <li><a href="#">Garden Salad</a></li>
    </ul>

    <ul>
        <c:forEach var="recipe" items="${allRecipes}">
            <li><c:out value="${recipe.getValue().getName()}"/></li>
        </c:forEach>
    </ul>

</body>
</html>
