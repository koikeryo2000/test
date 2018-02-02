package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.MasterProductStockDAO;
import com.internousdev.kokotown.dao.ProductSearchCountDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterProductStockAction extends ActionSupport implements SessionAware{

	private int countAdd1;

	private int countAdd2;

	private int stock1;

	private int stock2;

	//商品ID
	private int value1;

	private int value2;

	public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

	private Map<String, Object> session;

	public String execute() throws SQLException{
		String result = ERROR;

		ProductSearchCountDAO productSearchCountDAO = new ProductSearchCountDAO();
		MasterProductStockDAO masterProductStockDAO = new MasterProductStockDAO();

		if(value1!=value2) {
			//現在の在庫数を取得
			stock1 =productSearchCountDAO.getPuroductStockCount(value1);

			//減算時、在庫がマイナスにならないように比較
			if(stock1!=0 && (countAdd1*(-1))>stock1){
				countAdd1=stock1*(-1);
			}else if(stock1==0 && countAdd1<0){
				countAdd1=0;
			}

			//現在の在庫数を取得
			stock2 =productSearchCountDAO.getPuroductStockCount(value2);

			//減算時、在庫がマイナスにならないように比較
			if(stock2!=0 && (countAdd2*(-1))>stock2){
				countAdd2=stock2*(-1);
			}else if(stock2==0 && countAdd2<0){
				countAdd2=0;
			}

		}
		//商品ＩＤで検索し、商品の在庫個数をcountAdd分足し、エラーが出なければtrueを帰す
		if(value1!=value2 && masterProductStockDAO.ProdouctStock(countAdd1, value1, countAdd2, value2)){
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


	public int getCountAdd1() {
		return countAdd1;
	}

	public void setCountAdd1(int countAdd1) {
		this.countAdd1 = countAdd1;
	}

	public int getCountAdd2() {
		return countAdd2;
	}


	public void setCountAdd2(int countAdd2) {
		this.countAdd2 = countAdd2;
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

	public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}

	public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}
}
