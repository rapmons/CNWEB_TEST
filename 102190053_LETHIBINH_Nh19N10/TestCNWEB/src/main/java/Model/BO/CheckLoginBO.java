package Model.BO;
import java.util.ArrayList;

import Model.DAO.CheckLoginDAO;
public class CheckLoginBO { 
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO () ; 
	public boolean isValidUser (String userName, String password) {
		return checkLoginDAO.isExistUser(userName, password);
	}

	
}