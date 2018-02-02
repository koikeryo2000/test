package com.internousdev.kokotown.dto;

import java.util.ArrayList;

//import java.util.ArrayList;

public class GoCartDTO {
	public String productName;
	public String productNameKana;
	public String imageFilePath;
	public int price;
	public String releaseCompany;
	public String releaseDate;
	public int productId;
	ArrayList<Integer> buyCountList;
	public String priceComma;

	public int id;
	public String email;
	public String tempUserId;
	public int productCount;
	public int totalPrice;
	public String totalPriceComma;
	public int categoryId;

	public String getTempUserId() {
		return tempUserId;
	}
	public void setTempUserId(String tempUserId) {
		this.tempUserId = tempUserId;
	}
	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public String getProductNameKana(){
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana){
		this.productNameKana=productNameKana;
	}
	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath=imageFilePath;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public String getReleaseCompany(){
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany=releaseCompany;
	}
	public String getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate){
		this.releaseDate=releaseDate;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId=productId;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public int getProductCount(){
		return productCount;
	}
	public void setProductCount(int productCount){
		this.productCount=productCount;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice=totalPrice;
	}

	public String getPriceComma() {
		return priceComma;
	}
	public void setPriceComma(String priceComma) {
		this.priceComma = priceComma;
	}
	public String getTotalPriceComma() {
		return totalPriceComma;
	}
	public void setTotalPriceComma(String totalPriceComma) {
		this.totalPriceComma = totalPriceComma;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}




}
