

package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.kokotown.dto.LoginDTO;
import com.internousdev.kokotown.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();


	/**
	 * ログインユーザー情報取得メソッド
	 *
	 * @param email
	 * @param password
	 * @return LoginDTO
	 */
	public LoginDTO getUserInfo(String email, String password) {

		String sql = "SELECT * FROM user_info where email = ? AND password = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setEmail(resultSet.getString("email"));
				loginDTO.setPassword(resultSet.getString("password"));
				if(!(resultSet.getString("email").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

}