package com.internousdev.kokotown.dto;

public class LoginDTO {

//	private String userId;

	private String email;

	private String password;

	private String userIdError;

	private String passwordError;

	private boolean loginFlg = false;

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}

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

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public String getUserIdError() {
		return userIdError;
	}

	public void setUserIdError(String userIdError) {
		this.userIdError = userIdError;
	}

	public String getPasswordError() {
		return passwordError;
	}

	public void setPasswordError(String passwordError) {
		this.passwordError = passwordError;
	}
}
