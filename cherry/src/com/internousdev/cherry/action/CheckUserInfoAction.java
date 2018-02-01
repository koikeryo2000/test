package com.internousdev.cherry.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.cherry.dao.UserInfoDAO;
import com.internousdev.cherry.util.ErrorMessageConstants;
import com.internousdev.cherry.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CheckUserInfoAction extends ActionSupport implements ErrorMessageConstants {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;

	//0:男性、1:女性

	private String sex;
	private String email;
	private String userId;
	private String password;
	private ArrayList<String> errorMessageList = new ArrayList<>();
	public String execute() throws SQLException {
		String result = SUCCESS;
		UserInfoDAO dao = new UserInfoDAO();



		InputChecker i = new InputChecker();
		if (!i.familyNameChk(familyName).equals("OK")) {
			errorMessageList.add(i.familyNameChk(familyName));
			result = ERROR;
		}

		if (!i.firstNameChk(firstName).equals("OK")) {
			errorMessageList.add(i.firstNameChk(firstName));
			result = ERROR;
		}

		if (!i.familyNameKanaChk(familyNameKana).equals("OK")) {
			errorMessageList.add(i.familyNameKanaChk(familyNameKana));
			result = ERROR;
		}

		if (!i.firstNameKanaChk(firstNameKana).equals("OK")) {
			errorMessageList.add(i.firstNameKanaChk(firstNameKana));
			result = ERROR;
		}

		if(dao.existsUserId(userId)) {
			errorMessageList.add("入力されたIDは既に存在します。");
			result = ERROR;
		}else if (!i.userIdChk(userId).equals("OK")) {
			errorMessageList.add(i.userIdChk(userId));
			result = ERROR;
		}

		if (!i.passwordChk(password).equals("OK")) {
			errorMessageList.add(i.passwordChk(password));
			result = ERROR;
		}

		if (!i.emailChk(email).equals("OK")) {
			errorMessageList.add(i.emailChk(email));
			result = ERROR;
		}

		if (!(sex.equals("0") || sex.equals("1"))) {
			errorMessageList.add("性別の値が不正です");
			result = ERROR;
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

	public String isSex() {
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrMsgList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}
}