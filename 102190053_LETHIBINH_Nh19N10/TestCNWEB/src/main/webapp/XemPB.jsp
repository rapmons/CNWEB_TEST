
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XemNVPB</title>
</head>
<body>
 <table  border='1' width = '100%'> 
 <caption> Du lieu </caption>
    <tr>
 	<td> Ma Phong Ban</td>   
    <td> Ten</td>
    <td> Mo ta</td>
 	<td>Xem NV</td>
    </tr>
 	<% ArrayList<phongban> pbArray = (ArrayList<phongban>)request.getAttribute("pbArray");
 		for(int i = 0 ; i< pbArray.size();i++){
 	%>
 	
 		<tr>
 			<td> <%= pbArray.get(i).getIDPB() %></td>
 			
 			<td> <%= pbArray.get(i).getName() %></td>
 			<td> <%= pbArray.get(i).getmota() %></td>
 			<td> <a href="<%=request.getContextPath()%>/listNVPB?id=<%= pbArray.get(i).getIDPB() %>">nhan vien</a></td>	
 		</tr>
 		
 	<%} %>
 </table> 
 <a href="javascript:history.back()">Back</a>
</body>
</html>