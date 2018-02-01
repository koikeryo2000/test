package com.internousdev.cherry.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.cherry.dao.PurchaseHistoryDAO;
import com.internousdev.cherry.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * マイページからボタン押して遷移
 *
 *       (要) executeメソッドとdeleteメソッドの
 *        user_idをsessionからひっぱれるようにする！
 *
 *
 */
public class PurchaseHistoryAction extends ActionSupport implements SessionAware{
	/*
	 *セッション
	 */
	public Map<String, Object> session;

	/*
	 * 商品購入履歴取得DAO
	 */
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

	/*
	 * 商品購入履歴格納DTO List
	 */
	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();

	/*
	 * 削除フラグ
	 * 1 = 全件削除
	 * 2 = 個別ボタン削除
	 * 3 = チェックボックス削除
	 */
	private String deleteFlg;

	/*
	 * 削除メッセージ
	 */
	private String message;

	/*
	 * 個別削除id取得
	 */
	private int id;

	/*
	 * checkBoxの値
	 */
	private  List<String> chooseList;




	/*
	 * 商品購入履歴取得メソッド
	 */
	public String execute()throws SQLException{
		String result = SUCCESS;

		//sessionからもってこれるようにする
		String userId = (String) session.get("userId");

		if(deleteFlg == null){

			//session.get("user_id").toString()せっっしょンの名前！
			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);


			System.out.println("List = "+ historyList);


			Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();


			if(!(iterator.hasNext())){
				historyList = null;
			}
		} else if(deleteFlg.equals("1")){
			/*
			 * すべて削除するメソッド
			 */
			delete();
			//historyList = null;

		} else if(deleteFlg.equals("2")){
			/*
			 * 個別削除するメソッド
			 */
			System.out.println("ID:"+id);
			deletePart(id);

			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

		}	else if(deleteFlg.equals("3")){
			/*
			 * 選択した項目を削除
			 */
			System.out.println("chooseList:"+ chooseList);
			//deleteChoose(chooseList);

			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

		}

		historyList = purchaseHistoryDAO.getPurchaseHistory(userId);
		System.out.println("List = "+ historyList);
		return result;
	}







	/*
	 * 購入履歴削除メソッド
	 */
	public void delete() throws SQLException{
		//sessionからもってこれるようにする
		String user_id = session.get("userId").toString();;


		int res = purchaseHistoryDAO.deleteHistory(user_id);
		System.out.println("削除しようとする件数："+res);
		if(res > 0){
			System.out.println("削除した");
			historyList = null;
			setMessage("注文履歴をすべて削除しました");
		}else if(res == 0){
			System.out.println("削除失敗");
			//setMessage("商品の削除に失敗しました。");
		}

	}




	/*
	 * 個別削除メソッド
	 */
	public void deletePart(int id) throws SQLException{
		//jspからもってきた
		id = this.id;

		purchaseHistoryDAO.deletePart(id);
	}




	/*
	 * 選択削除メソッド

	public void deleteChoose(List<String> chooseList) throws SQLException{
		//jspからもってきたchooseList
			chooseList = this.chooseList;

		//何件削除したかもらう
			int res = purchaseHistoryDAO.deleteChoose(chooseList);

		//削除したときのメッセージ
			if(res > 0){
				setMessage(res + "件削除しました");
			} else if(res == 0){
				setMessage("削除しっぱぁぁぁぁぁい！！！");
			}
	}*/






	/*
	 *deleteFlg
	 */
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	/*
	 * jspからIDもってくる
	 */
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	/*
	 * 削除メッセージ
	 */
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	/*
	 * session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	/*
	 * checkBoxの値
	 */
	public List<String> getChooseList(){
		return chooseList;
	}
	public void setChooseList(List<String> chooseList){
		this.chooseList = chooseList;
	}

}






















