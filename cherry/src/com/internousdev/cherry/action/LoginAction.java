package com.internousdev.cherry.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.cherry.dao.CartInfoDAO;
import com.internousdev.cherry.dao.DestinationInfoDAO;
//import com.internousdev.cherry.dao.CartInfoDAO;
import com.internousdev.cherry.dao.LoginDAO;
import com.internousdev.cherry.dto.CartInfoDTO;
import com.internousdev.cherry.dto.DestinationInfoDTO;
//import com.internousdev.cherry.dto.CartInfoDTO;
import com.internousdev.cherry.dto.UserInfoDTO;
import com.internousdev.cherry.util.ErrorMessageConstants;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware, ErrorMessageConstants {

	private static final String KESSAI = "kessai";

	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * ID保持
	 */
	private boolean saveLogin;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * エラーメッセージ
	 */
	private ArrayList<String> errorMessageList = new ArrayList<>();

	/**
	 * 決済ページへ
	 */
	private int kessai;

	/**
	 * 合計金額
	 */
	private int totalPrice;

	/**
	 * 宛先情報一覧
	 */
	private ArrayList<DestinationInfoDTO> destinationInfoListDTO = new ArrayList<DestinationInfoDTO>();

	/**
	 * カートリスト
	 */
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

	private String familyNameKana;
	private String firstNameKana;
	private String familyName;
	private String firstName;
	private String email;
	private String telNumber;
	private String userAddress;


	public String execute() throws SQLException {
		String result = ERROR;
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		LoginDAO loginDAO = new LoginDAO();

		System.out.println(userId);
		//ユーザーID入力チェック
		if(userId==null){
			return "login";
		}
		if (userId.equals("")) {
			errorMessageList.add("ユーザーIDを入力してください");

		} else if (userId.length() < 1 || userId.length() > 16) {
			errorMessageList.add("ユーザーIDは1文字以上16文字以下で入力してください");

		} else if (!userId.matches("^[a-zA-Z0-9]+$")) {
			errorMessageList.add("ユーザーIDは半角英数字で入力してください");
		}

		//パスワード入力チェック
		if (password.equals("")) {
			errorMessageList.add("パスワードを入力してください。");

		} else if (password.length() < 1 || password.length() > 8) {
			errorMessageList.add("パスワードは1文字以上8文字以下で入力してください");

		} else if (!password.matches("^[a-zA-Z0-9]+$")) {
			errorMessageList.add("パスワードは半角英数字で入力してください");
		}

		//ID保存
		if (saveLogin) {
			session.put("saveId", userId);

		} else {
			session.remove("saveId");
		}

		if (!userId.equals("") && !password.equals("")) {
			// ユーザーIDがDBに存在するか確認
			if (!loginDAO.existsUserId(userId)) {
				errorMessageList.add("IDが正しくありません");
				result = ERROR;
			} else {
				userInfoDTO = loginDAO.select(userId, password);

				// ログイン判定
				if (userId.equals(userInfoDTO.getUserId()) && password.equals(userInfoDTO.getPassword())) {
					loginDAO.login(userInfoDTO);

					result = SUCCESS;

					// セッション情報の更新をする
					session.put("userId", userInfoDTO.getUserId());
					session.put("loginFlg", true);

					//カート、宛先情報を引き継ぐ
					System.out.println("kessai:"+kessai);
					if(kessai==1){
						CartInfoDAO dao=new CartInfoDAO();
						DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
						dao.changeUserId(session.get("tempUserId").toString(), session.get("userId").toString());
						cartList = dao.showUserCartList(session.get("userId").toString());
						destinationInfoListDTO = destinationInfoDAO.obtainingDestinationInfo(session.get("userId").toString());
						System.out.println("LoginAction:kessaiは1");
						//合計金額の計算
						totalPrice = calcTotalPrice(cartList);
						return KESSAI;
					}
				} else {
					errorMessageList.add("入力されたパスワードが異なります。");
					result = ERROR;
				}
			}
		}

		return result;
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


	public boolean isSaveLogin() {
		return saveLogin;
	}


	public void setSaveLogin(boolean saveLogin) {
		this.saveLogin = saveLogin;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}


	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public int getKessai() {
		return kessai;
	}


	public void setKessai(int kessai) {
		this.kessai = kessai;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public ArrayList<DestinationInfoDTO> getDestinationInfoListDTO() {
		return destinationInfoListDTO;
	}


	public void setDestinationInfoListDTO(ArrayList<DestinationInfoDTO> destinationInfoListDTO) {
		this.destinationInfoListDTO = destinationInfoListDTO;
	}


	public ArrayList<CartInfoDTO> getCartList() {
		return cartList;
	}


	public void setCartList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * 合計金額を計算するメソッド
	 */
	public int calcTotalPrice(ArrayList<CartInfoDTO> cartList) {
		int totalPrice = 0;
		for(CartInfoDTO dto: cartList) {
			totalPrice += dto.getPrice() * dto.getProductCount();
			System.out.println("合計" + totalPrice + "円");
		}
		return totalPrice;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}