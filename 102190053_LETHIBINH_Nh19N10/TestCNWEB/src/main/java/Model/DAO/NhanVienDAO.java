package Model.DAO;
import java.util.ArrayList;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;
import Model.BEAN.nhanvien;
public class NhanVienDAO {
	public void XoaNV (String idnv) { 
	
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "delete from nhanvien where IDNV='"+idnv+"';";
				stmt.executeUpdate(sql);
				
				
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}	
		
	}
	public void XoaNhieuNV (String[] idnv) { 
		for(String id : idnv) {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "delete from nhanvien where IDNV='"+id+"';";
				stmt.executeUpdate(sql);
				
				
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}	
		}
		 
		
	}
	public ArrayList<nhanvien> getNVList () {
		ArrayList<nhanvien> result = new ArrayList<nhanvien> (); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from nhanvien;";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					nhanvien nv = new nhanvien (); 
					String idnv = rs.getString("IDNV");
					String idpb = rs.getString("IDPB");
					String diachi = rs.getString("Diachi");
					String hoten = rs.getString("Hoten");

					nv.setAddress(diachi);
					nv.setIDNV(idnv);
					nv.setIDPB(idpb);
					nv.setName(hoten);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	public ArrayList<nhanvien> getNVPB (String IDPB) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien> (); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from nhanvien where IDPB='"+IDPB+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					nhanvien nv = new nhanvien (); 
					String idnv = rs.getString("IDNV");
					String idpb = rs.getString("IDPB");
					String diachi = rs.getString("Diachi");
					String hoten = rs.getString("Hoten");

					nv.setAddress(diachi);
					nv.setIDNV(idnv);
					nv.setIDPB(idpb);
					nv.setName(hoten);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	
	public void insertNV(String IdNV, String name, String IdPB, String Address)
	{
		
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
			Connection con = (Connection)DriverManager.getConnection(url, "root", "");
	        String sql ="insert nhanvien set IDNV='"+IdNV+"', Hoten='"+name+"' , IDPB='"+IdPB+"', Diachi='"+Address+"' ;";
	        Statement stmt = (Statement)con.createStatement();
	        stmt.executeUpdate(sql);
	        
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public ArrayList<nhanvien> getNVByID (String id) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien>(); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from nhanvien where IDNV = '"+id+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					nhanvien nv = new nhanvien (); 
					String idnv = rs.getString("IDNV");
					String idpb = rs.getString("IDPB");
					String diachi = rs.getString("Diachi");
					String hoten = rs.getString("Hoten");

					nv.setAddress(diachi);
					nv.setIDNV(idnv);
					nv.setIDPB(idpb);
					nv.setName(hoten);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	public ArrayList<nhanvien> getNVByIDPB (String id) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien>(); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from nhanvien where IDPB = '"+id+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					nhanvien nv = new nhanvien (); 
					String idnv = rs.getString("IDNV");
					String idpb = rs.getString("IDPB");
					String diachi = rs.getString("Diachi");
					String hoten = rs.getString("Hoten");

					nv.setAddress(diachi);
					nv.setIDNV(idnv);
					nv.setIDPB(idpb);
					nv.setName(hoten);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
	public ArrayList<nhanvien> getNVByName (String name) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien>(); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from nhanvien where Hoten = '"+name+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					nhanvien nv = new nhanvien (); 
					String idnv = rs.getString("IDNV");
					String idpb = rs.getString("IDPB");
					String diachi = rs.getString("Diachi");
					String hoten = rs.getString("Hoten");

					nv.setAddress(diachi);
					nv.setIDNV(idnv);
					nv.setIDPB(idpb);
					nv.setName(hoten);
					result.add(nv);
				}
				rs.close();
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}
		 
		return result;
	}
}