<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>

<body>
    <div >
       
        <form action="insert" method="post">
        <table>
        
          <tr>  <td> <label>IDNV</label> </td>		<td><input type="text"  name="IdNV">    </td> </tr>
          <tr>  <td><label>Ho Ten</label> </td>	<td><input type="text" name="name">    </td> </tr>               
          <tr>  <td><label>IdPB</label> </td>		<td>  
          <select name="IdPB" id="">
          <% ArrayList<phongban> pbArray = (ArrayList<phongban>)request.getAttribute("pbArray");
 		for(int i = 0 ; i< pbArray.size();i++){
 	%>
 	 
 			
 			<option value=<%= pbArray.get(i).getIDPB() %> ><%= pbArray.get(i).getIDPB() %></option>
 					
 		
 		
 	<%} %></select>
 	</td>
 	 
          </tr>
          
          <tr>  <td><label>Dia chi</label></td> 	<td><input type="text"  name="address"></td> </tr>
       
        </table>
           <button type="submit" class="btn btn-success">Save</button>
        </form>
          <a href="javascript:history.back()">Back</a>
    </div>
</body>

</html>
