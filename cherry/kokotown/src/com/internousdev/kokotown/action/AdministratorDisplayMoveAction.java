package com.internousdev.kokotown.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.MasterProductStockDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdministratorDisplayMoveAction extends ActionSupport implements SessionAware{

public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();


private Map<String, Object> session;

	public String execute() {
		MasterProductStockDAO masterProductStockDAO =new MasterProductStockDAO();
		productInfoDTOList = masterProductStockDAO.allItem();
		session.put("productInfoDTOList",productInfoDTOList);

		return SUCCESS;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;

	}
}
