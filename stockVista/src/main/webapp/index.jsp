<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Lista de productos de tipo 1</title>
</head>
<body>
	<h1>PRUEBA PROYECTO MAVEN</h1>
	
	<!-- Insertamos el RequestMapping con el nombre que le dimos -->
	<ul th:each="producto: ${listaproductos1}">
    	<li th:text="${producto.nombre}"></li>
    	<li th:text="${producto.precio}"></li>
	</ul>
	
</body>
</html>