package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.PurchaseHistoryInfoDAO;
import com.internousdev.kokotown.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryInfoAction extends ActionSupport implements SessionAware {

	//処理結果を格納
	private String result;
	//ログイン情報を格納
	public Map<String, Object> session;
	//デリートフラグ
	private String deleteFlg = "";
	//削除後のメッセージ
	private String message;
	//チェックボックスの判定に使用
    private Collection<String> checkList;

	public ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();
	PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();

	public String execute() throws SQLException {
		if (!(session.containsKey("email"))){
			return "loginError";
		}
		if(deleteFlg != null && checkList != null){
			purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryInfo(session.get("email").toString());
			//購入履歴情報リストをまわす
	        	for(int i=0;i<purchaseHistoryInfoDTOList.size();i++){
	        		//チェック済の数だけ削除をまわす
	        		for (String check : checkList) {
	        			long id = Long.parseLong(check);
	        			historyDelete((int)id);
	        	        }
	        	}
		}
		//削除後に改めて購入履歴情報を読み込む
		purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryInfo(session.get("email").toString());

			//情報がなければnullにする
			Iterator<PurchaseHistoryInfoDTO> iterator=purchaseHistoryInfoDTOList.iterator();
			if(!(iterator.hasNext())){
				purchaseHistoryInfoDTOList=null;
			}

		result=SUCCESS;
		return result;
	}

	//履歴を削除するメソッド
    public void historyDelete(int id) throws SQLException{
    	purchaseHistoryInfoDAO.purchaseHistoryDelete(session.get("email").toString(),id);
    }


	public ArrayList<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTO() {
		return purchaseHistoryInfoDTOList;
	}
	public void setPurchaseHistoryInfoDTO(ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTO) {
		this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTO;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}
	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public ArrayList<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList() {
		return purchaseHistoryInfoDTOList;
	}

	public void setPurchaseHistoryInfoDTOList(ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList) {
		this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTOList;
	}

}