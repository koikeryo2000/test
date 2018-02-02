package com.internousdev.kokotown.action;


import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.util.RandomId;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware  {

	/**
	 * Session情報
	 */
	public Map<String, Object> session;

	public String execute() {
		((SessionMap<String, Object>)session).invalidate();
		RandomId randomId=new RandomId();
		session.put("tempUserId",randomId.getTempUserId());
		session.put("cartFlg", false);

		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
