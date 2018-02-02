package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.CartDAO;
import com.internousdev.kokotown.dao.SettlementConfirmDAO;
import com.internousdev.kokotown.dto.GoCartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartMoveAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private CartDAO cartDAO=new CartDAO();
	//カート情報リスト
	public ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();
	public SettlementConfirmDAO settlementConfirmDAO=new SettlementConfirmDAO();
	private int productCount;
	private int price;
	private int productId;
	//カートに追加するフラグ
	private String addFlg;
	//カート情報を削除するフラグ
	private String deleteFlg;
	//チェックリストのコレクション
	private Collection<String> checkList;
	private String tempUserId;
	private ArrayList<Integer> count;
	//3桁ごとにカンマを入れる
	private String cartTotalPriceComma;



	public String execute()throws SQLException{
		String result=ERROR;

		session.put("productCount", productCount);


		//ログインしてないとき
		if(!(session.containsKey("email"))){
			//カート情報読み込み
			if(!(session.containsKey("tempUserId"))){
				return "tempError";
			}
			cartInfoList=cartDAO.getNoLoginedCartInfo(session.get("tempUserId").toString());
			for(GoCartDTO dto:cartInfoList){
				//すでに入っている商品が追加された場合
				if(dto.getProductId()==productId){
					settlementConfirmDAO.noLoginUpdateBuyCount(session.get("tempUserId").toString(), productId, productCount);
					settlementConfirmDAO.noLoginUpdateTotalPrice(session.get("tempUserId").toString(), productId, productCount, price);
					addFlg=null;
				}
			}


			//商品を追加する場合
			if(addFlg != null){
				noLoginedAddCart();
			}
			//商品を削除する場合
			else if(deleteFlg != null && checkList != null){
				cartInfoList=cartDAO.getNoLoginedCartInfo(session.get("tempUserId").toString());
				//カートの商品数だけループ
				for(int i=0;i<cartInfoList.size();i++){

					//チェック済みの数だけループ
					for (String check : checkList) {
						long id = Long.parseLong(check);
						noLoginedProductDelete((int)id);
					}
				}
			}

			//追加、削除の判定の後にカートを読み込む
			cartInfoList=cartDAO.getNoLoginedCartInfo(session.get("tempUserId").toString());


			//カートに情報がなければnullにする
			Iterator<GoCartDTO> iterator=cartInfoList.iterator();
			if(!(iterator.hasNext())){
				cartInfoList=null;
			}
			//カートの合計金額計算
			if(cartInfoList != null){
				calcCartTotalPrice();
			}
		}

		//ログインしているとき
		else{
			cartInfoList=cartDAO.getCartInfo(session.get("email").toString());
			for(GoCartDTO dto:cartInfoList){
				////すでに入っている商品が追加された場合
				if(dto.getProductId()==productId){
					settlementConfirmDAO.updateBuyCount(session.get("email").toString(), productId, productCount);
					settlementConfirmDAO.updateTotalPrice(session.get("email").toString(), productId, productCount, price);
					addFlg=null;
				}
			}


			//商品を追加する場合
			if(addFlg != null){
				addCart();
			}
			//商品を削除する場合
			else if(deleteFlg != null && checkList != null){
				cartInfoList=cartDAO.getCartInfo(session.get("email").toString());
				//カートの商品数だけループ
				for(int i=0;i<cartInfoList.size();i++){
					//チェック済みの数だけループ
					for (String check : checkList) {
						long id = Long.parseLong(check);
						productDelete((int)id);
					}
				}
			}
			//追加、削除の判定の後にカートを読み込む
			cartInfoList=cartDAO.getCartInfo(session.get("email").toString());


			//カートに情報がなければnullにする
			Iterator<GoCartDTO> iterator=cartInfoList.iterator();
			if(!(iterator.hasNext())){
				cartInfoList=null;
			}

			//カートの合計金額計算
			if(cartInfoList != null){
				calcCartTotalPrice();
			}
		}

		result=SUCCESS;
		return result;

	}

	//商品を追加するメソッド(ログインしている)
	public void addCart() throws SQLException{
		//totalPriceの計算
		int intCount=Integer.parseInt(session.get("productCount").toString());
		session.put("intTotalPrice",price * intCount);

		//DAOに渡すための定義
		String email=session.get("email").toString();
		String productCount=session.get("productCount").toString();
		String totalPrice=session.get("intTotalPrice").toString();

		cartDAO.addProduct(email,productId,productCount,totalPrice);
	}

	//商品を追加するメソッド(ログインしていない)
	public void noLoginedAddCart() throws SQLException{
		//totalPriceの計算
		int intCount=Integer.parseInt(session.get("productCount").toString());
		session.put("intTotalPrice",price * intCount);

		//DAOに渡すための定義
		String tempUserId=session.get("tempUserId").toString();
		String productCount=session.get("productCount").toString();
		String totalPrice=session.get("intTotalPrice").toString();

		cartDAO.noLoginedAddProduct(tempUserId,productId,productCount,totalPrice);
	}



	//商品を削除するメソッド（ログインしている）
	public void productDelete(int id) throws SQLException{
		cartDAO.checkedItemDelete(session.get("email").toString(),id);
	}

	//商品を削除するメソッド（ログインしていない）
	public void noLoginedProductDelete(int id) throws SQLException{
		cartDAO.noLoginedCheckedItemDelete(session.get("tempUserId").toString(),id);
	}

	//合計金額を計算
	public void calcCartTotalPrice(){
		int cartTotalPrice=0;
		for(int i=0; i < cartInfoList.size(); i++) {
			// += で足して変数に格納を繰り返す。
			cartTotalPrice += cartInfoList.get(i).getTotalPrice();
			//3桁でカンマが入るように型に入れる
			cartTotalPriceComma = String.format("¥ %,d", cartTotalPrice);
		}
		session.put("cartTotalPrice", cartTotalPrice);
		session.put("cartTotalPriceComma", cartTotalPriceComma);

	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCount(){
		return productCount;
	}
	public void setProductCount(int productCount){
		this.productCount=productCount;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public String getAddFlg(){
		return addFlg;
	}
	public void setAddFlg(String addFlg){
		this.addFlg=addFlg;
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	public Collection<String> getCheckList() {
		return checkList;
	}
	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getTempUserId() {
		return tempUserId;
	}

	public void setTempUserId(String tempUserId) {
		this.tempUserId = tempUserId;
	}

	public ArrayList<GoCartDTO> getCartInfoList() {
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<GoCartDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}

	public ArrayList<Integer> getCount() {
		return count;
	}

	public void setCount(ArrayList<Integer> count) {
		this.count = count;
	}
}

