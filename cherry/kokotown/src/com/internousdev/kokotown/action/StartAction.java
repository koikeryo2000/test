package com.internousdev.kokotown.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.util.RandomId;
import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	public String execute(){
		RandomId randomId=new RandomId();

		session.clear();
		session.put("tempUserId",randomId.getTempUserId());
		session.put("cartFlg", false);

		return SUCCESS;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
