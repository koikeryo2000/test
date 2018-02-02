package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.MyPageDTO;
import com.internousdev.kokotown.util.DBConnector;

public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();


	public ArrayList<MyPageDTO> getMyPageUserInfo( String user_master_id) throws SQLException {
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();

		String sql = "SELECT * FROM user_info WHERE user_master_id = ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_master_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MyPageDTO dto = new MyPageDTO();
				dto.setFamilyName(resultSet.getString("FamilyName"));
				dto.setFirstName(resultSet.getString("FirstName"));
				dto.setFamilyNameKana(resultSet.getString("FamilyNameKana"));
				dto.setFirstNameKana(resultSet.getString("FirstNameKana"));
				dto.setSex(resultSet.getString("Sex"));
				dto.setEmail(resultSet.getString("Email"));
				myPageDTO.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return myPageDTO;
	}
}
