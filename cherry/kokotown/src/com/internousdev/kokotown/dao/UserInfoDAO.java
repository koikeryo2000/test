package com.internousdev.kokotown.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.UserInfoDTO;
import com.internousdev.kokotown.util.DBConnector;
public class UserInfoDAO {

	DBConnector db=new DBConnector();
	Connection con= null;

	/**
	 * ユーザー情報を新規登録する
	 */
	public boolean registerUser(UserInfoDTO dto) throws SQLException{
		boolean result=false;
		int updateCount=0;

		String sql="INSERT INTO user_info(email, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, regist_date) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, NOW())";
		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getEmail());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getFamilyName());
			ps.setString(4, dto.getFirstName());
			ps.setString(5, dto.getFamilyNameKana());
			ps.setString(6, dto.getFirstNameKana());
			ps.setBoolean(7, dto.getSex());
			ps.setString(8, dto.getEmail());

			updateCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		if(updateCount == 1) {
			result = true;
		}

		return result;
	}


	/**
	 * 指定したユーザーのパスワードを変更する
	 * @param password
	 * @param userId
	 * @return
	 */
	public int  update(String password,String email) {
		int ret = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE user_info SET password = ? WHERE email = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, email);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件変更されました。");
				ret = i;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;

	}

	/**
	 * 必要なユーザー情報を引き出している
	 * @param email
	 * @param password
	 * @return dto
	 */
	public ArrayList<UserInfoDTO> userInfo(String email,String password){
		ArrayList<UserInfoDTO> userInfoDTO=new ArrayList<UserInfoDTO>();
		Connection con=db.getConnection();

		String sql="SELECT email,family_name,first_name,family_name_kana,first_name_kana,sex FROM user_info WHERE email = ? AND password = ?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2,password);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				UserInfoDTO dto=new UserInfoDTO();
				dto.setEmail(rs.getString("email"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getBoolean("sex"));
				userInfoDTO.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userInfoDTO;
	}

	/**
	 * ユーザーIDが登録されているかValidation判定で使う
	 * @param userId
	 * @return
	 */
	public boolean existsEmail(String email) throws SQLException {
		boolean result = false;
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE email = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}
}

