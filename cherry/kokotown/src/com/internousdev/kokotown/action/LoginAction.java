package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.CartDAO;
import com.internousdev.kokotown.dao.LoginDAO;
import com.internousdev.kokotown.dao.SettlementConfirmDAO;
import com.internousdev.kokotown.dao.UserInfoDAO;
import com.internousdev.kokotown.dto.GoCartDTO;
import com.internousdev.kokotown.dto.LoginDTO;
import com.internousdev.kokotown.dto.SettlementConfirmDTO;
import com.internousdev.kokotown.dto.UserInfoDTO;
import com.internousdev.kokotown.util.Validation;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行う
 *
 * @author
 * @param email
 * @param password
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware {

	//email
	private String email;
	//ログインパスワード
	private String password;
	//処理結果を格納
	private String result;
	//ログイン情報を格納
	public Map<String, Object> session;
	//ログイン情報取得DAO
	private LoginDAO loginDAO = new LoginDAO();
	//ログイン情報格納IDTO
	private LoginDTO loginDTO = new LoginDTO();
	//ユーザーエラー
	public String emailError;
	//パスワードエラー
	public String passwordError;
	public String inputError;
	//checkbox
	public String checkbox;
	//Validation
	public Validation val = new Validation();

	public ArrayList<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();

	//ゲストのカート情報をユーザーで登録し直す。DB検索とDB登録のメソッドを使うため。
	private CartDAO cartDAO = new CartDAO();
	private ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();
	private ArrayList<GoCartDTO> loginCartInfoList=new ArrayList<GoCartDTO>();
	//宛先情報DTOをListに格納
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();

	/**
	 * 実行メソッド
	 */
	public String execute()throws SQLException{
		result = ERROR;
		// ログイン実行
		loginDTO = loginDAO.getUserInfo(email, password);
		session.put("user",loginDTO);

		// ログイン情報を比較
		if(((LoginDTO) session.get("user")).getLoginFlg()) {
			//ログイン成功
			result = SUCCESS;
			session.put("email", loginDTO.getEmail());
			session.put("password", loginDTO.getPassword());

			UserInfoDAO userInfoDAO = new UserInfoDAO();
			userInfoDTOList = userInfoDAO.userInfo(session.get("email").toString(),session.get("password").toString());

			//宛先情報取得
			SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
			destinationList = settlementConfirmDAO.getDestinationInfo(session.get("email").toString());

			/*一般ユーザーのログイン*/

			//ゲストユーザーのカート情報取得
			if(!(session.containsKey("tempUserId"))){
				return "tempError";
			}
			cartInfoList = cartDAO.getNoLoginedCartInfo(session.get("tempUserId").toString());
			//ログイン状態のカート情報
			loginCartInfoList= cartDAO.getCartInfo(session.get("email").toString());
			//ゲストユーザーのカート情報があればログインユーザーのカートに追加
			if(cartInfoList != null) {
				for(int j=0; j<cartInfoList.size();j++){
					int productId=cartInfoList.get(j).getProductId();
					int productCount=cartInfoList.get(j).getProductCount();
					int totalPrice=cartInfoList.get(j).getTotalPrice();
					int price =cartInfoList.get(j).getPrice();
					boolean addFlg=true;

					//在庫と合計金額を更新
					for(int i=0;i<loginCartInfoList.size();i++){
						if(productId == loginCartInfoList.get(i).getProductId()){
							settlementConfirmDAO.updateBuyCount(session.get("email").toString(), productId, productCount);
							settlementConfirmDAO.updateTotalPrice(session.get("email").toString(), productId, productCount, price);
							addFlg=false;
						}
					}
					//引数は全部String (email,productId,productCount,totalPrice)
					//int→String のためString.valueOf()使用
					if(addFlg){
						cartDAO.addProduct(loginDTO.getEmail(),productId,String.valueOf(productCount),String.valueOf(totalPrice));
					}
				}
				//ゲストユーザーのカート情報全削除
				cartDAO.allItemDelete(session.get("tempUserId").toString());
			}
			if(Boolean.valueOf(session.get("cartFlg").toString())){
				result="cartMove";
				cartInfoList= cartDAO.getCartInfo(session.get("email").toString());
			}
		}
		//エラーメソッド
		//email
		if(!(val.emailChk(email).equals("OK"))){
			emailError = val.emailChk(email);
			result = ERROR;
		}else if(userInfoDTOList.size()==0){
			inputError = "入力されたパスワードかメールアドレスが異なります。";
		}
		//PASSWORD
		if(!(val.passwordChk(password).equals("OK"))){
			passwordError = val.passwordChk(password);
			result = ERROR;
		}else if(userInfoDTOList.size()==0){
			inputError = "入力されたパスワードかメールアドレスが異なります。";
		}
		return result;
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

	public String getUserIdError() {
		return emailError;
	}
	public void setUserIdError(String emailError) {
		this.emailError = emailError;
	}

	public String getPasswordError() {
		return passwordError;
	}
	public void setPasswordError(String passwordError) {
		this.passwordError = passwordError;
	}

	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<GoCartDTO> getLoginCartInfoList() {
		return loginCartInfoList;
	}
	public void setLoginCartInfoList(ArrayList<GoCartDTO> loginCartInfoList) {
		this.loginCartInfoList = loginCartInfoList;
	}

}
