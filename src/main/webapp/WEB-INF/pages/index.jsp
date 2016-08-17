<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value='../../resources/css/index.css' />" type="text/css"/>
	</head>

	<body>
		<div id="header">
			<h1>Gradumake</h1>
			<h2 id="tagline">Goodbye Ramen, Hello Quinoa</h2>
		</div>

		<div>
			<h2>Ingredients</h2>
			<h3>Please write the ingredients in your fridge:</h3>

			<form action="/recipes" method="get">
				<span>
					<textarea required placeholder="bread, ham, lettuce, tomato"></textarea>
					<button type="submit">Submit</button>
				</span>
			</form>
		</div>
	</body>
</html>