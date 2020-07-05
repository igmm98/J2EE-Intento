<%@	page import="Modelo.Asesoria" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Asesoria A_sesoria = (Asesoria)request.getAttribute("Modelo");
	%>
	<h1>INFORMACION</h1>
	<table>
	<tr>
		<td>Rut cliente:</td>
		<td><%= A_sesoria.getRutClienteAsesoria() %></td>
	</tr>
	<tr>
		<td>Detalle:</td>
		<td><%= A_sesoria.getDetalleAsesoria() %></td>
	</tr>
	</table>
</body>
</html>