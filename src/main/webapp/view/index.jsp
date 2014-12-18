<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<table>
	<tr>
		<td>Id</td>
		<td>Name</td>		
		<td>Price</td>		
	</tr>
<c:forEach items="${products}" var="product">
	<tr>
		<td>${product.id }</td>
		<td><a href="product/buyProduct/${product.id }/">${product.name }</a></td>
		<td>${product.price }</td>
	</tr>
</c:forEach>
</table>

<form:form method="post" action="addProduct" modelAttribute="addProduct">
	<label>Name</label>
	<form:input path="name"/>
	<label>Price</label>
	<form:input path="price"/>
	<input type="submit" value="Create">
</form:form>

</body>
</html>