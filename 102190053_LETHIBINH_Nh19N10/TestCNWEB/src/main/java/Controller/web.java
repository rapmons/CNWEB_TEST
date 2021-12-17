package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.BEAN.*;

import Model.BO.*;

@WebServlet("/")

public class web extends HttpServlet
{
	private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	String action = request.getServletPath();
    		try {
                switch (action) {
                	case "/CheckLoginServlet":
                		checklogin(request, response);
                		break;
                    case "/newNV":
                    	chenNV(request, response);
                        break;                
                    case "/insert":
                        insertNV(request, response);
                        break;             
                    case "/listNV":
                    	listNV(request, response);
                    	break;
                    case "/TimNV":
                    	timNV(request, response);
                    	break;
                    case "/listPB":
                    	listPB(request, response);
                    	break;
                    case "/listNVPB":
                    	listNVPB(request, response);
                    	break;
                    case "/xoanhieu":
                    	xoaNhieu(request, response);
                        break;
                    case "/listxoaNV":
                    	listxoaNV(request, response);
                    case "/listxoaNhieuNV":
                    	listxoaNhieuNV(request, response);
                    case "/xoaNV":
                    	xoaNV(request, response);
                        break;
                    case "/listSuaPB":
                    	listSuaPB(request, response);
                        break;    
                    case "/editPB":
                        suaPB(request, response);
                        break;
                    
                    case "/update":
                        updatePB(request, response);
                        break;
                    case "/guest":
                    	String destination = null; 
                    	request.setAttribute("User", "guest");
        				destination = "/index.jsp";				
        				RequestDispatcher rd = request.getRequestDispatcher(destination); 
        				rd.forward (request, response); 
        				
                        break;

                    default:
                        listNV(request, response);
                        break;
                
                }
    			
            } catch (SQLException ex) {
                throw new ServletException(ex);
            }
    
    }
    
    
    
    private void listNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    	        ArrayList < nhanvien > nvArray =nv.getNVList();
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XemNV.jsp");
    	        dispatcher.forward(request, response);
    	    }  
    private void timNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {         
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("TimKiemNV.jsp");
    	        dispatcher.forward(request, response);
    	    } 
    private void listxoaNhieuNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    	        ArrayList < nhanvien > nvArray =nv.getNVList();
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XoaNhieuNV.jsp");
    	        dispatcher.forward(request, response);//response.sendRedirect("listNV");
    	    }
    private void listxoaNV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    	        ArrayList < nhanvien > nvArray =nv.getNVList();
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XoaNV.jsp");
    	        dispatcher.forward(request, response);
    	    }
    

    
    private void listPB(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           PhongBanBO pb=new PhongBanBO(); 
    	        ArrayList < phongban > pbArray = pb.getPBList();
    	        request.setAttribute("pbArray", pbArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XemPB.jsp");
    	        dispatcher.forward(request, response);
    }
    
    private void listSuaPB(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           PhongBanBO pb=new PhongBanBO(); 
    	        ArrayList < phongban > pbArray = pb.getPBList();
    	        request.setAttribute("pbArray", pbArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("listSuaPB.jsp");
    	        dispatcher.forward(request, response);
    }
    
    private void listNVPB(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {           NhanVienBO nv=new NhanVienBO(); 
    			String id = (String)request.getParameter("id");
    	        ArrayList < nhanvien > nvArray =nv.getNVPB(id);
    	        request.setAttribute("nvArray", nvArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("XemNV.jsp");
    	        dispatcher.forward(request, response);
    }
   private void chenNV(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
   {PhongBanBO pb=new PhongBanBO(); 
   ArrayList < phongban > pbArray =pb.getPBList();
   
   request.setAttribute("pbArray", pbArray);
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("ChenNV.jsp");
    	        dispatcher.forward(request, response);
   }

   private void xoaNhieu(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
  {              NhanVienBO nv=new NhanVienBO(); 
			    ArrayList < nhanvien > nvArray =nv.getNVList();
			    String ID[] = request.getParameterValues("idNVs");
			    for(String s: ID) {
			    	 nv.xoaNV(s);
			    }
			    
			    response.sendRedirect("listNV");
   }
   private void xoaNV(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		        String id = (String)request.getParameter("id");
		        NhanVienBO nv=new NhanVienBO();
		        nv.xoaNV(id);
		        response.sendRedirect("listNV");

		    }

   private void updatePB(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
			   PhongBanBO pb=new PhongBanBO(); 
			   String id = request.getParameter("id"); 
			   String name = request.getParameter ("name"); 
			   String mota = request.getParameter ("mota"); 
			   pb.updatePB (id, name,  mota);
			   ArrayList < phongban > pbArray =pb.getPBList();
			   
			   request.setAttribute("pbArray", pbArray);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("XemPB.jsp");
		        dispatcher.forward(request, response);

    	    }
   private void suaPB(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String id = (String)request.getParameter("id");
        PhongBanBO pbBO=new PhongBanBO(); 
        phongban pb=pbBO.getPBbyID(id);
        request.setAttribute("pb", pb);
        RequestDispatcher dispatcher = request.getRequestDispatcher("SuaPB.jsp");
        dispatcher.forward(request, response);

    }

    private void insertNV(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String IdNV = request.getParameter("IdNV");
        String IdPB = request.getParameter("IdPB");
        NhanVienBO sv=new NhanVienBO();
        sv.insertNV(IdNV,name,IdPB, address);
        response.sendRedirect("listNV");
    }
    

    
    private void checklogin (HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    		String destination = null; 
    		String userName = request.getParameter("userName"); 
    		String password = request.getParameter ("password"); 
	
    		CheckLoginBO checkLoginBO = new CheckLoginBO(); 

    		if (checkLoginBO.isValidUser (userName, password)) { 

    			request.setAttribute("User", userName);
    			destination = "/index.jsp";				
    			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination); 
    			rd.forward (request, response); 
    		} else {
    			destination = "/login.jsp";
    			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
    			rd.forward (request, response);		
    		}
    	}
}