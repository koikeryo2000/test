package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.DestinationDTO;
import com.internousdev.kokotown.util.DBConnector;
import com.internousdev.kokotown.util.DateUtil;

public class DestinationDAO {

	DBConnector db = new DBConnector();
	Connection con = null;
	private DateUtil dateUtil=new DateUtil();

	/**
	 * 宛先情報をDBに登録する
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	public boolean registerDestination(DestinationDTO dto) throws SQLException {

		int updateCount = 0;
		boolean result = false;
		String sql = "INSERT INTO destination_info("
				+ "family_name, "
				+ "first_name, "
				+ "family_name_kana, "
				+ "first_name_kana, "
				+ "email, "
				+ "tel_number, "
				+ "user_address, "
				+ "regist_date )"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getFamilyName());
			ps.setString(2, dto.getFirstName());
			ps.setString(3, dto.getFamilyNameKana());
			ps.setString(4, dto.getFirstNameKana());
			ps.setString(5, dto.getEmail());
			ps.setString(6, dto.getTelNumber());
			ps.setString(7, dto.getUserAddress());
			ps.setString(8,dateUtil.getDate());
			updateCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		if (updateCount == 1) {
			result = true;
		}
		return result;
	}


	/**
	 * 指定したユーザーの宛先情報取得
	 * @throws SQLException
	 */
	public ArrayList<DestinationDTO> obtainingDestinationInfo(String email) throws SQLException{
		ArrayList<DestinationDTO> destinationList = new ArrayList<DestinationDTO>();

		String sql="SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email FROM destination_info WHERE email = ?";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				DestinationDTO dto = new DestinationDTO();
				dto.setId(rs.getInt("id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setUserAddress(rs.getString("user_address"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setEmail(rs.getString("email"));
				destinationList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return destinationList;
	}

}
