<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.ltts.*,java.util.*" %>
    <%@ page import="com.ltts.PrakharRastogi_99004321.dao.ProductionDao" %>
    <%@ page import="com.ltts.PrakharRastogi_99004321.model.Productions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
</head>
<body>
<h1>Production Delete</h1><br><br>
<%
ProductionDao pd=new ProductionDao();
int id=Integer.parseInt(request.getParameter("id"));
pd.deleteProduction(id);
%>
<a href="index.html">Home</a>
<h1 style=color:green> Successfully Deleted</h1>
</body>
</html>