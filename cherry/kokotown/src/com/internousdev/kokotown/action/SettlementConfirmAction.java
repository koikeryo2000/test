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
/**
 * 決済確認画面
 *
 *カート情報と宛先情報の取得
 *
 * @author oohara
 *
 * @return SUCCESS
 */
public class SettlementConfirmAction extends ActionSupport implements SessionAware{

	//session
	public Map<String,Object> session;

	//DAO
	private SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	private CartDAO cartDAO =new CartDAO();

	//宛先情報DTOをListに格納
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();

	//カート情報受け取り
	public ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();

	private boolean buyCountErrorFlg=false;

	//購入個数、在庫比較リスト
	private ArrayList<GoCartDTO> buyCountErrorList=new ArrayList<GoCartDTO>();

	//未ログインカートフラグ

	private boolean cartFlg;

	/**
	 * @throws SQLException
	 *
	 *
	 */
	public String execute() throws SQLException{
		String result = ERROR;
		//System.out.println(session.containsKey("email"));
		if(session.containsKey("email")){
			//宛先情報取得
			destinationList = settlementConfirmDAO.getDestinationInfo(session.get("email").toString());

			//カート情報取得
			cartInfoList=cartDAO.getCartInfo(session.get("email").toString());


			//購入個数、在庫比較処理
			for(GoCartDTO dto:cartInfoList){
				int stock=settlementConfirmDAO.getCount(dto.getProductId());
				if(dto.getProductCount()>stock){
					buyCountErrorList.add(dto);
					System.out.println("カートリスト:"+cartInfoList.size());
					System.out.println("カウントエラーリスト:"+buyCountErrorList.size());
					buyCountErrorFlg=true;
					result="countError";

				}
			}
			if(buyCountErrorList.size()>0){
				return result;
			}
			session.put("cartInfoList", cartInfoList);

			//カートの合計金額計算
			if(cartInfoList != null){
				calcCartTotalPrice();
			}

			result = SUCCESS;

		}
		if(!(session.containsKey("email"))){
			cartFlg=true;
			session.put("cartFlg", cartFlg);
		}
		return result;
	}

	//合計金額を計算
	public void calcCartTotalPrice(){
		int cartTotalPrice=0;
		//    	System.out.println(cartInfoList.size());
		for(int i=0; i < cartInfoList.size(); i++) {
			// += で足して変数に格納を繰り返す。
			//    	System.out.println(cartInfoList.get(i).getTotalPrice());
			cartTotalPrice += cartInfoList.get(i).getTotalPrice();
		}
		session.put("cartTotalPrice", cartTotalPrice);
	}


	public ArrayList<SettlementConfirmDTO> getDestinationList() {
		return destinationList;
	}

	public void setDestinationList(ArrayList<SettlementConfirmDTO> destinationList) {
		this.destinationList = destinationList;
	}

	public boolean getBuyCountErrorFlg() {
		return buyCountErrorFlg;
	}

	public void setBuyCountErrorFlg(boolean buyCountErrorFlg) {
		this.buyCountErrorFlg = buyCountErrorFlg;
	}

	//セッション
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public boolean isCartFlg() {
		return cartFlg;
	}

	public void setCartFlg(boolean cartFlg) {
		this.cartFlg = cartFlg;
	}



}
