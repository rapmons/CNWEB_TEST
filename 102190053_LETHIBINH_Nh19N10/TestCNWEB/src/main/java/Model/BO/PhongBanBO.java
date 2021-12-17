package Model.BO;
import java.util.ArrayList;

import Model.BEAN.*;
import Model.DAO.*;
public class PhongBanBO { 
	PhongBanDAO pbDAO = new PhongBanDAO () ; 
	public void updatePB (String ID,String ten, String mota) {
		pbDAO.UpdatePB(ID, ten, mota);

	}
	public ArrayList<phongban> getPBList () {
		return pbDAO.getPBList();
	}
	public phongban getPBbyID(String id) {
		return pbDAO.getPBbyID(id);
	}
	
}