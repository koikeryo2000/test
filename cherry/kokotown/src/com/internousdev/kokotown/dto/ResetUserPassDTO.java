package com.internousdev.kokotown.dto;

public class ResetUserPassDTO {

	//ログインID
	private String email;

	//新規パスワード
	private String newPassword;

	//確認パスワード
	private String confirmPassword;

	//hideログインID
	private String hideEmail;

	//hide確認パスワード
	private String hideNewLoginPassword;

	//ログインIDのゲッターセッター
	public String getLoginId() {
		return email;
	}
	public void setLoginId(String email) {
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

	//hideログインIDのゲッターセッター
	public String getHideEmail() {
		return hideEmail;
	}
	public void setHideEmail(String hideEmail) {
		this.hideEmail = hideEmail;
	}

	//hide確認パスワードのゲッターセッター
	public String getHideNewLoginPassword() {
		return hideNewLoginPassword;
	}
	public void setHideNewLoginPassword(String hideNewLoginPassword) {
		this.hideNewLoginPassword = hideNewLoginPassword;
	}

}
