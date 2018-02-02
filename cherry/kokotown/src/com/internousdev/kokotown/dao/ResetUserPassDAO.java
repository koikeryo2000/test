package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dto.ResetUserPassDTO;
import com.internousdev.kokotown.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

/**
 * パスワード再設定用のDAO
 *
 *
 *ログインIDが存在するかDBから探すメソッド
 *新しいパスワードをDBにセットするメソッド
 *文字列を加工、指定範囲を残して他すべてを*に差し替えるメソッド
 *
 * @author oohara
 */

public class ResetUserPassDAO extends ActionSupport implements SessionAware{


	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	//ログインIDと新規パスワードを格納
	public Map<String,Object> session;
	//ログインIDと新規パスワードを格納
	ResetUserPassDTO resetUserPassDTO = new ResetUserPassDTO();
	//一致するログインIDが存在するかDBから探す
	public boolean getEmail(String email){

		String sql = "SELECT * FROM user_info where email = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				resetUserPassDTO.setLoginId(rs.getString("email"));
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;
	}

	//新しいパスワードをDBにセットする
	public boolean resetPassword(String newLoginPassword,String email){

		String sql="UPDATE user_info SET password =? where email= ?";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, newLoginPassword);
			ps.setString(2,email);

			ps.executeUpdate();
			return true;

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//文字列を加工、指定範囲を残して他すべてを*に差し替える
	//word:加工する文字列
	//a:切り出す文字の開始位置
	//b:切り出す文字の終了位置
	public String hideString (String word,int a,int b){

		//加工した文字をいれる型定義
		String hideWord;

		//文字の長さをセット
		int wordLength;
		wordLength = word.length();

		//aからbまでの文字列を切り出し
		hideWord = word.substring(a, b);

		//切り出した文字列以外は*で埋める
		//aの位置まで*で埋める
		int i = 0;
		while(i < a){
			hideWord = "*" + hideWord;
			i++;
		}
		//bの位置から文字列の長さだけ*で埋める
		i = 0;
		while(i < wordLength - b){
			hideWord = hideWord  + "*";
			i++;
		}

		return hideWord;
	}

	//セッション
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
