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
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("Productions List");
ProductionDao pd=new ProductionDao();

List<Productions> li=pd.getAllProduction();
%>
<table>
<tr>
<th>Production ID</th>
<th>Production Name</th>
<th>Address</th>
<th>Date Of Started</th>
<th>Owner Name</th>
<th>Edit Production</th>
</tr>
<%
for(Productions p:li)
{
%>
<tr>
<td><%=p.getProductionid() %></td>
<td><%=p.getProductionname() %></td>
<td><%=p.getAddress() %></td>
<td><%=p.getDateofStarted() %></td>
<td><%=p.getOwnername() %></td>
<td><a href="edit.jsp?id=<%=p.getProductionid() %>">Edit</a></td>
<td><a href="del.jsp?id=<%=p.getProductionid() %>">Delete</a></td>
</tr>
<%} %>
</table>

</body>
</html>