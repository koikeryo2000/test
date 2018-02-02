package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.CartDAO;
import com.internousdev.kokotown.dao.SettlementConfirmDAO;
import com.internousdev.kokotown.dto.GoCartDTO;
import com.internousdev.kokotown.dto.SettlementConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
	private SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	private boolean buyCountErrorFlg=false;
	private ArrayList<GoCartDTO> buyCountErrorList=new ArrayList<GoCartDTO>();



	//決済処理

	public String execute() throws SQLException{

		if (!(session.containsKey("email"))){
			return "loginError";
		}

		String	result=ERROR;

		destinationList = settlementConfirmDAO.getDestinationInfo(session.get("email").toString());
		if(destinationList.size()!=0){

			result = SUCCESS;
			CartDAO cartDAO=new CartDAO();

			//カート情報読み込み
			cartInfoList=cartDAO.getCartInfo(session.get("email").toString());
			//個数比較
			for(GoCartDTO dto:cartInfoList){
				int stock=settlementConfirmDAO.getCount(dto.getProductId());
				if(dto.getProductCount()>stock){
					buyCountErrorList.add(dto);
					System.out.println("カートリスト:"+cartInfoList.size());
					System.out.println("カウントエラーリスト:"+buyCountErrorList.size());
					setBuyCountErrorFlg(true);
					result="countError";

				}
			}
			if(buyCountErrorList.size()>0){
				return result;
			}


			//カートリストの数だけfor 購入履歴テーブルに登録 在庫数変動
			for(GoCartDTO goCartDTO: cartInfoList){
				cartDAO.insertPurchaseHistory(session.get("email").toString(), goCartDTO.getProductId(), goCartDTO.getProductCount(),goCartDTO.getPrice());
				int stock=settlementConfirmDAO.getCount(goCartDTO.getProductId());
				cartDAO.updateStock(goCartDTO.getProductId(), stock, goCartDTO.getProductCount());

			}
			//購入したユーザーのカート情報を消去
			cartDAO.deleteCartInfo(session.get("email").toString());


		}
		return result;

	}


	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


	public boolean isBuyCountErrorFlg() {
		return buyCountErrorFlg;
	}


	public void setBuyCountErrorFlg(boolean buyCountErrorFlg) {
		this.buyCountErrorFlg = buyCountErrorFlg;
	}


	public ArrayList<GoCartDTO> getCartInfoList() {
		return cartInfoList;
	}


	public void setCartInfoList(ArrayList<GoCartDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}


	public ArrayList<GoCartDTO> getBuyCountErrorList() {
		return buyCountErrorList;
	}


	public void setBuyCountErrorList(ArrayList<GoCartDTO> buyCountErrorList) {
		this.buyCountErrorList = buyCountErrorList;
	}
}



