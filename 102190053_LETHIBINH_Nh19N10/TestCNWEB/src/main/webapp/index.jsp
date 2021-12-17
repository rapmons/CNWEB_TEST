<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>

<body>
<%

	session.setAttribute("User",request.getAttribute("User"));

%>

    <a href="<%=request.getContextPath()%>/listNV"><span>Xem thông tin nhân viên</span></a> <br>
    <a href="<%=request.getContextPath()%>/listPB"><span>Xem thông tin phòng ban</span></a> <br>
    <a href="<%=request.getContextPath()%>/TimNV"><span>Tìm kiếm </span></a> <br>
<%
if(session.getAttribute("User")!=null && (String)session.getAttribute("User")!="guest"){
%>    
    <a href="<%=request.getContextPath()%>/newNV"><span>Thêm nhân viên</span></a> <br>
    <a href="<%=request.getContextPath()%>/listSuaPB"><span>Cập nhật thông tin phòng ban</span></a> <br>
    <a href="<%=request.getContextPath()%>/listxoaNhieuNV"><span>Xóa nhiều nhân viên</span></a> <br>
    <a href="<%=request.getContextPath()%>/listxoaNV"><span>Xóa nhân viên</span></a>
    
<%} %>

    
</body>
</html>
