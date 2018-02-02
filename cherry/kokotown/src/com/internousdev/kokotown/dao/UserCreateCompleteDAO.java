package com.internousdev.kokotown.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kokotown.dto.UserInfoDTO;
import com.internousdev.kokotown.util.DBConnector;
public class UserCreateCompleteDAO {

	DBConnector db=new DBConnector();
	Connection con= null;

	/**
	 * ユーザー情報を新規登録する
	 */
	public boolean registerUser(UserInfoDTO dto) throws SQLException{
		boolean result=false;
		int updateCount=0;

		String sql="INSERT INTO user_info(password, family_name, first_name, family_name_kana, first_name_kana, sex, email, regist_date) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, NOW())";
		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			//	ps.setString(1, dto.getUserId());
			ps.setString(1, dto.getPassword());
			ps.setString(2, dto.getFamilyName());
			ps.setString(3, dto.getFirstName());
			ps.setString(4, dto.getFamilyNameKana());
			ps.setString(5, dto.getFirstNameKana());
			ps.setBoolean(6, dto.getSex());
			ps.setString(7, dto.getEmail());

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


}