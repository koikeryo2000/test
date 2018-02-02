package com.internousdev.kokotown.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * パスワード再設定画面へ遷移するだけ
 *
 *
 * @author oohara
 *
 * @return SUCCESS login
 */

public class ResetUserPassMoveAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("email")){
			result = SUCCESS;
		}else{
			result = ERROR;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
