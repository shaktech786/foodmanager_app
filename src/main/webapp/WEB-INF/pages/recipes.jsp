<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value='../../resources/css/recipes.css' ></c:url>" />
</head>
<body>
    <%@ include file="partials/_header.jsp" %>
    <h2>Recipes</h2>
    <p>With the following ingredients in your fridge: ${ingredientList}, you may be able to use these recipes. <br>Bon Appetit!</br></p>
</body>
</html>
