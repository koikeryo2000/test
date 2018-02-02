package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.AdministratorDeleteProductDAO;
import com.internousdev.kokotown.dao.MasterProductStockDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdministratorDeleteProductAction extends ActionSupport implements SessionAware{

	private ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
	private int value1;
	private int value2;
	private int value3;
	private int value4;
	private int value5;

	private Map<String, Object> session;

	public String execute() throws SQLException{
	  String result=ERROR;
		MasterProductStockDAO masterProductStockDAO =new MasterProductStockDAO();
		AdministratorDeleteProductDAO administratorDeleteProductDAO = new AdministratorDeleteProductDAO();

		if(administratorDeleteProductDAO.ProdouctDelete(value1, value2, value3, value4, value5)){
			productInfoDTOList = masterProductStockDAO.allItem();
			session.put("productInfoDTOList",productInfoDTOList);
			result= SUCCESS;
		}
		return result;
	}

	@Override
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

	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getValue3() {
		return value3;
	}
	public void setValue3(int value3) {
		this.value3 = value3;
	}

	public int getValue4() {
		return value4;
	}
	public void setValue4(int value4) {
		this.value4 = value4;
	}

	public int getValue5() {
		return value5;
	}
	public void setValue5(int value5) {
		this.value5 = value5;
	}
}
