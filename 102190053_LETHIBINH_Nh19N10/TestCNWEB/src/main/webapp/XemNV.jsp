
<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XemNV</title>
</head>
<body>


 <table border='1' width = '100%'>
 <caption> Du lieu </caption>
    <tr>
    <td> Ma nhan vien</td>     
    <td> Ten</td>
    <td> Dia chi</td>
      <td> Ma Phong Ban</td>
    </tr>
 	<% ArrayList<nhanvien> nvArray = (ArrayList<nhanvien>)request.getAttribute("nvArray");
 		for(int i = 0 ; i< nvArray.size();i++){
 	%>
 	
    
 		 <tr>
 			<td> <%= nvArray.get(i).getIDNV() %></td>
 			
 			<td> <%= nvArray.get(i).getName() %></td>
 			<td> <%= nvArray.get(i).getAddress() %></td>
 			<td> <%= nvArray.get(i).getIDPB() %></td>
 			</tr>
 		
 		
 	<%} %>
 </table> 
 <a href="javascript:history.back()">Back</a>
</body>
</html>