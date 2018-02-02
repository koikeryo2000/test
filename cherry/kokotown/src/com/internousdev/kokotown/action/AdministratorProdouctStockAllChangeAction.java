package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.MasterProductStockDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdministratorProdouctStockAllChangeAction extends ActionSupport implements SessionAware{


	private int countAddAll;



	public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

	private Map<String, Object> session;

	public String execute() throws SQLException{
		String result = ERROR;

		MasterProductStockDAO masterProductStockDAO = new MasterProductStockDAO();
		if(masterProductStockDAO.ProdouctStockAllChange(countAddAll)){
			productInfoDTOList = masterProductStockDAO.allItem();
			session.put("productInfoDTOList",productInfoDTOList);
			result = SUCCESS;
		}
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}
	public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}

	public int getCountAddAll() {
		return countAddAll;
	}
	public void setCountAddAll(int countAddAll) {
		this.countAddAll = countAddAll;
	}
}
