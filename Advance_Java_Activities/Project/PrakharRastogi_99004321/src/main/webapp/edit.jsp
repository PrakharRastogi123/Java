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
<h1>Production Edit</h1><br><br>
<%
ProductionDao pd=new ProductionDao();
int id=Integer.parseInt(request.getParameter("id"));
Productions p=pd.getProductionById(id);
%>
<form action="update" method="post">
<input type="hidden" name="pid" value="<%=id%>"><br><br>
Production Name: <input type="text" name="pname" value="<%=p.getProductionname() %>"> <br><br>
Production Address : <input type="text" name="addr" value="<%=p.getAddress() %>"><br><br>
Production Date Of Start : <input type="text" name="dos" value="<%=p.getDateofStarted() %>"><br><br>
Production Owner Name : <input type="text" name="ownername" value="<%=p.getOwnername() %>"><br><br>
<input type="submit" value="Update Production"><br>
</form>
</body>
</html>