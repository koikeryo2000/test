package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.PurchaseHistoryInfoDTO;
import com.internousdev.kokotown.util.DBConnector;

public class PurchaseHistoryInfoDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();


	//DBから商品購入履歴の情報を取得

	public ArrayList<PurchaseHistoryInfoDTO> getPurchaseHistoryInfo(String email) throws SQLException {
		ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTO = new ArrayList<PurchaseHistoryInfoDTO>();

		String sql = "SELECT * FROM purchase_history_info LEFT JOIN product_info ON purchase_history_info.product_id = product_info.product_id WHERE email  =? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setPrice(resultSet.getString("price"));
				dto.setPriceComma(String.format("¥ %,d", resultSet.getInt("price")));
				dto.setProductCount(resultSet.getInt("product_Count"));
				dto.setReleaseCompany(resultSet.getString("release_company"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setId(resultSet.getInt("id"));
				purchaseHistoryInfoDTO.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return purchaseHistoryInfoDTO;
	}

	//チェックの入った商品履歴を削除

	public boolean purchaseHistoryDelete(String email,int id) throws SQLException{
		String sql="DELETE FROM purchase_history_info  WHERE email=? AND id=?";
		PreparedStatement ps;

		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setInt(2, id);

			ps.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
}
