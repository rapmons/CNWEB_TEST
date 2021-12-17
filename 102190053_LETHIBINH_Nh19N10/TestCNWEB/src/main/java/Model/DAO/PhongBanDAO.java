package Model.DAO;
import java.util.ArrayList;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;
import Model.BEAN.*;
import Model.BEAN.nhanvien;
public class PhongBanDAO {
	public void UpdatePB (String ID,String ten, String mota) { 
		
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "update phongban set TenPB='"+ten+"',Mota='"+mota+"' where IDPB='"+ID+"';";
				stmt.executeUpdate(sql);
				
				
				stmt.close();						
			}
			catch(Exception a)
			{
				System.out.println("Error " + a);
			}	
		
	}
	public ArrayList<phongban> getPBList () {
		ArrayList<phongban> result = new ArrayList<phongban> (); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from phongban;";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					phongban pb = new phongban (); 
					String idpb = rs.getString("IDPB");
					String ten = rs.getString("TenPB");
					String mota = rs.getString("Mota");

					pb.setIDPB(idpb);
					pb.setmota(mota);
					pb.setName(ten);
					result.add(pb);
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
	
	public phongban getPBbyID(String id) {
		phongban result = new phongban(); 
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
				Connection con = (Connection)DriverManager.getConnection(url, "root", "");
				Statement stmt = (Statement)con.createStatement();
				String sql = "select * from phongban where IDPB='"+id+"';";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					phongban pb = new phongban (); 
					String idpb = rs.getString("IDPB");
					String ten = rs.getString("TenPB");
					String mota = rs.getString("Mota");

					pb.setIDPB(idpb);
					pb.setmota(mota);
					pb.setName(ten);
					result=pb;
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