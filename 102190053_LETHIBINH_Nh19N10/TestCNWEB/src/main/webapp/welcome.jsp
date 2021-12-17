<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body>
<%
if(session.getAttribute("User")==null){
	session.setAttribute("User",request.getAttribute("User"));
}


%>

<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Xem NV"/>
	<input type="hidden" id="custId" name="id" value="XemNV">
</form>
<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Xem PB"/>
	<input type="hidden" id="custId" name="id" value="XemPB">
</form>
<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Tim NV"/>
	<input type="hidden" id="custId" name="id" value="TimNV">
</form>

<%
if(session.getAttribute("User")!=null){
%>
<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Sua PB"/>
	<input type="hidden" id="custId" name="id" value="SuaPB">
</form>
<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Chen NV"/>
	<input type="hidden" id="custId" name="id" value="ChenNV">
</form>

<form action="XemNV" method="post" name = "xemnv">
	<input type="submit" value="Xoa NV"/>
	<input type="hidden" id="custId" name="id" value="XoaNV">
</form>


<%} %>

</body>
</html>
 
