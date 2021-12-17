package Model.BO;
import java.util.ArrayList;

import Model.BEAN.*;
import Model.DAO.*;
public class NhanVienBO { 
	NhanVienDAO nvDAO = new NhanVienDAO () ; 
	
	public void xoaNV (String id) {
		nvDAO.XoaNV(id);
	}
	
	public void xoaNhieuNV (String[] id) {
		for(String i : id) {
			nvDAO.XoaNV(i);
		}
	}
	
	public ArrayList<nhanvien> getNVList () {
		return nvDAO.getNVList();
	}
	
	public ArrayList<nhanvien> getNVPB (String IDPB) {
		return nvDAO.getNVPB(IDPB);
	}
	
	public void insertNV(String IdNV, String name, String IdPB, String Address){
		nvDAO.insertNV(IdNV, name, IdPB, Address);
	}
	
	public ArrayList<nhanvien> getNVByIDPB (String id) {
		return nvDAO.getNVByIDPB(id);
	}
	public ArrayList<nhanvien> getNVByID (String id) {
		return nvDAO.getNVByID(id);
	}
	public ArrayList<nhanvien> getNVByName (String name) {
		return nvDAO.getNVByName(name);
	}
	
	
	
}