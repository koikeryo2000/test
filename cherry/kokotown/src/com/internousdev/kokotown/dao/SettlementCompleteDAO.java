package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.GoCartDTO;
import com.internousdev.kokotown.util.DBConnector;

public class SettlementCompleteDAO {

	DBConnector dbConnector=new DBConnector();
	Connection connection=dbConnector.getConnection();

	public ArrayList<GoCartDTO> goCartDTOList=new ArrayList<GoCartDTO>();

	/**
	 * 指定したログインユーザーのカート情報をすべて取得
	 */

	public ArrayList<GoCartDTO> getUserCartList(String userId){


		String sql="SELECT * FROM cart_info LEFT JOIN product_info ON cart_info.product_id = product_info.product_id where cart_info.user_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				GoCartDTO goCartDTO=new GoCartDTO();
				goCartDTO.setProductName(resultSet.getString("product_name"));
				goCartDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				goCartDTO.setImageFilePath(resultSet.getString("image_file_path"));
				goCartDTO.setPrice(resultSet.getInt("price"));
				goCartDTO.setReleaseCompany(resultSet.getString("release_company"));
				goCartDTO.setReleaseDate(resultSet.getString("release_date"));
				goCartDTO.setProductId(resultSet.getInt("product_id"));

				goCartDTO.setId(resultSet.getInt("id"));
				goCartDTO.setEmail(resultSet.getString("email"));
				goCartDTO.setProductCount(resultSet.getInt("product_count"));
				goCartDTO.setTotalPrice(resultSet.getInt("total_price"));

				goCartDTOList.add(goCartDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return goCartDTOList;
	}

	//カートの商品を決済後購入履歴に登録

	public void insertPurchaseHistory(String userId,int productId,int productCount){

		String sql="INSERT INTO purchase_history_info(user_id, product_id, product_count, regist_date) VALUES( ?, ?, ?, NOW())";

		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, productCount);

			preparedStatement.execute();


		} catch (SQLException e) {
			e.printStackTrace();
		}try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

	//決済後のカート情報を削除

	public void deleteCartInfo(String userId){

		String sql="DELETE FROM cart_info WHERE user_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
