package com.internousdev.kokotown.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.ResetUserPassDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * パスワード再設定完了
 *
 *
 * @author oohara
 * @param loginUserId
 * @param loginPassword
 * @param loginPasswordConfirm
 *
 * @return SUCCESS
 */

public class ResetUserPassCompleteAction extends ActionSupport implements SessionAware{


	//ログインID
	private String email;

	//新規パスワード
	private String newPassword;

	//ログインIDと新規パスワードを格納
	public Map<String,Object> session;

	//パスワード更新に使うDAOをインスタンス化
	private ResetUserPassDAO resetUserPassDAO = new ResetUserPassDAO();

	public String execute(){
		String result = "login";
		if(email != null){
			//DBのパスワードを新規パスワードに更新
			resetUserPassDAO.resetPassword(newPassword, email);
			result = SUCCESS;
		}else{
			result = ERROR;
		}
		return result;
	}


	//セッション
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
