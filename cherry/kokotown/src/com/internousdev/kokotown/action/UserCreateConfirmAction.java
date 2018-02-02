package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.ResetUserPassDAO;
import com.internousdev.kokotown.dao.UserInfoDAO;
import com.internousdev.kokotown.util.ErrorMessageConstants;
import com.internousdev.kokotown.util.Validation;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements ErrorMessageConstants,SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;

	/**
	 * 0:男性、1:女性
	 */
	private String sex;
	private String email;
	private String password;
	private String confirmPassword;
	private String hidePassword;
	private ResetUserPassDAO resetUserPassDAO = new ResetUserPassDAO();

	//パスワード再設定用のエラーメッセージを格納
	public String passwordErrorMessage;

	private ArrayList<String> errMsgList = new ArrayList<>();
	private Map<String, Object> session;

	public String execute() throws SQLException {

		String result = SUCCESS;
		UserInfoDAO dao = new UserInfoDAO();

		if(familyName==null){
			return ERROR;
		}

		Validation i = new Validation();
		if (!i.familyNameChk(familyName).equals("OK")) {
			errMsgList.add(i.familyNameChk(familyName));
			result = ERROR;
		}

		if (!i.firstNameChk(firstName).equals("OK")) {
			errMsgList.add(i.firstNameChk(firstName));
			result = ERROR;
		}

		if (!i.familyNameKanaChk(familyNameKana).equals("OK")) {
			errMsgList.add(i.familyNameKanaChk(familyNameKana));
			result = ERROR;
		}

		if (!i.firstNameKanaChk(firstNameKana).equals("OK")) {
			errMsgList.add(i.firstNameKanaChk(firstNameKana));
			result = ERROR;
		}

		if (!(sex.equals("0") || sex.equals("1"))) {
			errMsgList.add("性別の値が不正です");
			result = ERROR;
		}

		if(dao.existsEmail(email)) {
			errMsgList.add("入力されたemailは既に存在します。");
			result = ERROR;
		}else if (!i.emailChk(email).equals("OK")) {
			errMsgList.add(i.emailChk(email));
			result = ERROR;
		}

		if (!i.passwordChk(password).equals("OK")) {
			errMsgList.add(i.passwordChk(password));
			return ERROR;
		}
		//新規パスワードと確認パスワードを比較
		if(password != null && password.equals(confirmPassword)){
			hidePassword = resetUserPassDAO.hideString(password, 0,2);
		}else{
			passwordErrorMessage = "入力された確認パスワードが異なります。";
			result=ERROR;
		}
		return result;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}
	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getHidePassword() {
		return hidePassword;
	}
	public void setHidePassword(String hidePassword) {
		this.hidePassword = hidePassword;
	}
}

