<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="Model.BEAN.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div >

           <%    phongban pb =(phongban)request.getAttribute("pb");   %> 
                        <form action="update" method="post">
                            <label>ID PB</label> <input type="text" readonly name="id" value=<%= pb.getIDPB() %>>  
                            <label>Ten PB</label> <input type="text"  name="name" value=<%= pb.getName() %>>                     
                        
                            <label>Mo Ta</label> <input type="text"  name="mota" value=<%= pb.getmota() %> />
                        
                           <button type="submit" class="btn btn-success">Save</button>
                        </form>
                  <a href="javascript:history.back()">Back</a>
            </div>
</body>
</html>
