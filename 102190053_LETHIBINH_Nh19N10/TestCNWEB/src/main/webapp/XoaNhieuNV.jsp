<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="Model.BEAN.*" %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="xoanhieu" method="Post">
      <table border=1 width="100%">
       <tr><th>Id</th><th>Ho ten</th><th>Dia chi</th><th>Phong ban</th><th>Xoa</th></tr>
       <% ArrayList<nhanvien> nvArray = (ArrayList<nhanvien>)request.getAttribute("nvArray");
 		for(int i = 0 ; i< nvArray.size();i++){
 		%>

 		 <tr>
 			<td> <%= nvArray.get(i).getIDNV() %></td>
 			
 			<td> <%= nvArray.get(i).getName() %></td>
 			<td> <%= nvArray.get(i).getAddress() %></td>
 			<td> <%= nvArray.get(i).getIDPB() %></td>
 			<td><input name="idNVs" value=<%=  nvArray.get(i).getIDNV()%> type="checkbox"></td></tr>

 	
 		
 	<%} %>
        </table><input style="display: block; margin: 15px 0 0 auto" type="submit" value="Xoa tat ca" /> <br></form>
<a href="javascript:history.back()">Back</a>
</body>
</html>