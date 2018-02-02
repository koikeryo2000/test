package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.DestinationDAO;
import com.internousdev.kokotown.dto.DestinationDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String telNumber;
	private String userAddress;

	public String execute() throws SQLException {

		if (!(session.containsKey("email"))){
			return "loginError";
		}

		String result = ERROR;

		DestinationDTO dto = new DestinationDTO();
		dto.setFullName(familyName, firstName, familyNameKana, firstNameKana);
		dto.setEmail(session.get("email").toString());
		dto.setTelNumber(telNumber);
		dto.setUserAddress(userAddress);

		DestinationDAO dao = new DestinationDAO();
		//宛先情報をDBへ登録
		if (dao.registerDestination(dto)) {
			result = SUCCESS;
		}
		return result;
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

	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
