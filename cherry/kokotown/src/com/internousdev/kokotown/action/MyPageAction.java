package com.internousdev.kokotown.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.SettlementConfirmDAO;
import com.internousdev.kokotown.dao.UserInfoDAO;
import com.internousdev.kokotown.dto.SettlementConfirmDTO;
import com.internousdev.kokotown.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	/**
	 * セッション
	 */
	public Map<String,Object> session;

	/**
	 * ユーザー情報一覧
	 */
	public ArrayList<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();


	//宛先情報DTOをListに格納
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();

	/**
	 * ユーザー情報取得メソッド
	 */
	public String execute() {
		String result = ERROR;
	    UserInfoDAO userInfoDAO = new UserInfoDAO();
	    SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	    if(session.containsKey("email")){
			userInfoDTOList = userInfoDAO.userInfo(session.get("email").toString(),session.get("password").toString());
			destinationList = settlementConfirmDAO.getDestinationInfo(session.get("email").toString());
			if(userInfoDTOList.size() > 0) {
				result = SUCCESS;
			}
	    }
		return result;
	}

	/**
	 * @return userInfoDTO
	 */
	public ArrayList<UserInfoDTO> getUserInfoDTO() {
		return userInfoDTOList;
	}

	/**
	 * @param userInfoDTO セットする userInfoDTO
	 */
	public void setUserInfoDTO(ArrayList<UserInfoDTO> userInfoDTO) {
		this.userInfoDTOList = userInfoDTO;
	}

	public ArrayList<SettlementConfirmDTO> getDestinationList() {
		return destinationList;
	}

	public void setDestinationList(ArrayList<SettlementConfirmDTO> destinationList) {
		this.destinationList = destinationList;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}