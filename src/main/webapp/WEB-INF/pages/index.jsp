<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value='../../resources/css/index.css' />" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="../../resources/js/index.js"></script>
    </head>

	<body>
		<%@ include file="partials/_header.jsp" %>
		<div>
			<h2>Ingredients</h2>
			<h3>Please write the ingredients in your fridge:</h3>
			<p id="ingredient-error-message"></p>
			<form action="/recipes" method="post" onsubmit="return validateInput()">
				<span>
					<textarea name="ingredients"required placeholder="bread, ham, lettuce, tomato"></textarea>
					<button id="submit" type="submit">Submit</button>
				</span>
			</form>
		</div>
	</body>
</html>