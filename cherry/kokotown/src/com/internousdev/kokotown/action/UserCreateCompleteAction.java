package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.UserCreateCompleteDAO;
import com.internousdev.kokotown.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	Map<String, Object> session;
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

	public String execute() throws SQLException {
		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();
		UserInfoDTO dto = new UserInfoDTO();
		dto.setUserName(familyName, firstName, familyNameKana, firstNameKana);
		if(sex.equals("0")) {
			dto.setSex(false);
		} else if (sex.equalsIgnoreCase("1")) {
			dto.setSex(true);
		}
		dto.setEmail(email);
		dto.setPassword(password);

		if (dao.registerUser(dto)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}


	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public String getSex(){
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
}

