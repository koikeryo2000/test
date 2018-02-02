package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.ProductInfoDetailDAO;
import com.internousdev.kokotown.dto.ProductInfoDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailAction extends ActionSupport implements SessionAware {

	public int productId;
	private int categoryId;
	private int id;
	private ArrayList<Integer> buyCount = new ArrayList<Integer>();
	public ProductInfoDetailDTO dto;
	public Map<String, Object> session;
	public ArrayList<ProductInfoDetailDTO> detailList;
	public ArrayList<ProductInfoDetailDTO> sameCategoryList;
	public ProductInfoDetailDAO productInfoDetailDAO = new ProductInfoDetailDAO();


	public String execute() {
		String result = ERROR;
		try {
			//商品詳細
			detailList = productInfoDetailDAO.getDetail(productId);
			//同じカテゴリーの商品リスト
			sameCategoryList=productInfoDetailDAO.sameCategoryList(categoryId,productId);
			//在庫数を取得し、その数をbuyCountとして登録
			for(int i=0; i<detailList.get(0).getProductCount();i++){
				buyCount.add(i+1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		result = SUCCESS;
		return result;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Integer> getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(ArrayList<Integer> buyCount) {
		this.buyCount = buyCount;
	}
}
