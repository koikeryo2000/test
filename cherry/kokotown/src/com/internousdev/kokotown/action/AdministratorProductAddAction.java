package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.AdministratorProductAddDAO;
import com.internousdev.kokotown.dao.MasterProductStockDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdministratorProductAddAction extends ActionSupport implements SessionAware{

	Map<String, Object> session;

	private int productId;
	private int categoryId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int price;
	private int count;
	private String imageFileName;
	private String imageFileNamePath;
	private  String releaseDate;
	private String releaseCompany;
	private ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

	public String execute() throws SQLException{
		MasterProductStockDAO masterProductStockDAO = new MasterProductStockDAO();
		String result=ERROR;

		ProductInfoDTO dto = new ProductInfoDTO();
		AdministratorProductAddDAO dao = new AdministratorProductAddDAO();

		dto.setProductId(productId);
		dto.setProductName(productName);
		dto.setProductNameKana(productNameKana);
		dto.setProductDescription(productDescription);
		dto.setCategoryId(categoryId);
		dto.setPrice(price);
		dto.setStock(count);
		dto.setImageFilePath(imageFileNamePath);
		dto.setImageFileName(imageFileName);
		dto.setReleaseDate(releaseDate);
		dto.setReleaseCompany(releaseCompany);

		if(dao.ProductAdd(dto)) {
			productInfoDTOList = masterProductStockDAO.allItem();
			session.put("productInfoDTOList",productInfoDTOList);

			result=SUCCESS;
		}
		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageFileNamePath() {
		return imageFileNamePath;
	}
	public void setImageFileNamePath(String imageFileNamePath) {
		this.imageFileNamePath = imageFileNamePath;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
}
