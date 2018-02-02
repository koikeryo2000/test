package com.internousdev.kokotown.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.util.ErrorMessageConstants;
import com.internousdev.kokotown.util.Validation;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationConfirmAction extends ActionSupport implements ErrorMessageConstants,SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String telNumber;
	private String userAddress;
	private ArrayList<String> errMsgList = new ArrayList<>();
	private Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		if(familyName==null){
			return ERROR;
		}

		//Validationを使って入力内容のチェック
		Validation v = new Validation();
		if (!v.familyNameChk(familyName).equals("OK")) {
			errMsgList.add(v.familyNameChk(familyName));
			result = ERROR;
		}
		if (!v.firstNameChk(firstName).equals("OK")) {
			errMsgList.add(v.firstNameChk(firstName));
			result = ERROR;
		}
		if (!v.familyNameKanaChk(familyNameKana).equals("OK")) {
			errMsgList.add(v.familyNameKanaChk(familyNameKana));
			result = ERROR;
		}
		if (!v.firstNameKanaChk(firstNameKana).equals("OK")) {
			errMsgList.add(v.firstNameKanaChk(firstNameKana));
			result = ERROR;
		}
		if (!v.telNumberChk(telNumber).equals("OK")) {
			errMsgList.add(v.telNumberChk(telNumber));
			result = ERROR;
		}
		if (!v.userAddressChk(userAddress).equals("OK")) {
			errMsgList.add(v.userAddressChk(userAddress));
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
}
