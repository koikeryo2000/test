package com.internousdev.kokotown.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.ResetUserPassDAO;
import com.internousdev.kokotown.util.Validation;
import com.opensymphony.xwork2.ActionSupport;

/**
 * パスワード再設定確認
 *
 *jspからログインID、新規パスワード、確認パスワードを受け取り、バリデーションと入力値のチェックを行ってから
 *sessionにDBのパスワードのupdateに必要なemail、新規パスワードの保存と
 *パスワード再設定確認画面に必要な一部表示を隠したemailとloginPasswordを保存
 *
 * @author oohara
 * @param email
 * @param newPassword
 * @param confirmPassword
 * @param passwordErrorMessage
 * @param confirmPassword
 * @return SUCCESS or ERROR
 */

public class ResetUserPassConfirmAction extends ActionSupport implements SessionAware{

	//ログインID
	private String email;

	//新規パスワード
	private String newPassword;

	//確認パスワード
	private String confirmPassword;

	//パスワード再設定用のエラーメッセージを格納
	public String passwordErrorMessage;

	private String hideEmail;

	private String hideNewLoginPassword;

	//DAO
	private ResetUserPassDAO resetUserPassDAO = new ResetUserPassDAO();

	//ログインIDと新規パスワードを格納
	public Map<String,Object> session;

	//バリデーションをインスタンス化
	public Validation val = new Validation();


	public String execute(){
		//		String result = "login";
		//		if(session.containsKey("email")){
		//			if((newPassword != null) && (confirmPassword !=null)){
		//入力値のチェックをして問題なければsessionに値を保存して遷移する。
		//一致するIDがDBにあるか
		if(!resetUserPassDAO.getEmail(email)){
			passwordErrorMessage = "入力されたEMAILが異なります。";
			return ERROR;
		}

		//パスワードが規格にあっているか
		if(!(val.passwordChk(newPassword).equals("OK"))){
			passwordErrorMessage = val.passwordChk(newPassword);
			return ERROR;
		}

		//新規パスワードと確認パスワードを比較
		if(newPassword.equals(confirmPassword)){

			//sessionに一部表示を隠したemailとloginPasswordを保存
			//resetUserPassDAO.hideString(加工する文字列,切り出す文字の開始位置,切り出す文字の終了位置)
			//先頭二文字を残して*に置き換える
			hideEmail = resetUserPassDAO.hideString(email, 0,2);
			hideNewLoginPassword = resetUserPassDAO.hideString(newPassword, 0,2);

			return SUCCESS;
		}else{
			passwordErrorMessage = "入力された確認パスワードが異なります。";
			return ERROR;
		}
		//			}else{
		//				//パスワード入力なし
		//				result = ERROR;
		//			}
		//		}else{
		//			//未ログイン
		//			result = "login";
		//		}
		//		return result;
	}

	//ログインIDのゲッターセッター
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//新規パスワードのゲッターセッター
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	//確認パスワードのゲッターセッター
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	//セッション
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getHideEmail() {
		return hideEmail;
	}

	public void setHideEmail(String hideEmail) {
		this.hideEmail = hideEmail;
	}

	public String getHideNewLoginPassword() {
		return hideNewLoginPassword;
	}

	public void setHideNewLoginPassword(String hideNewLoginPassword) {
		this.hideNewLoginPassword = hideNewLoginPassword;
	}
}
