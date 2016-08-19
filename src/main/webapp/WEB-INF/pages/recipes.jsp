<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value='../../resources/css/recipes.css' ></c:url>" />
</head>
<body>
    <%@ include file="partials/_header.jsp" %>
    <h2>Recipes</h2>
    <p>With the following ingredients in your fridge: ${ingredientList}, you may be able to use these recipes. <br>Bon Appetit!</br></p>

    <ul>
        <c:set var="ing" value="${ingredientList}"/>

        <c:forEach var="recipe" items="${allRecipes}">
            <c:set var="validIng" value="${recipe.getValue().getIngredients()}"/>
            <c:if test="${fn:contains(validIng, ing)}">
                <li class="recipeName"><c:out value="${recipe.getValue().getName()}"/></li>
            </c:if>
        </c:forEach>
    </ul>

</body>
</html>
