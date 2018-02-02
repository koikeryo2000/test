package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.SettlementConfirmDTO;
import com.internousdev.kokotown.util.DBConnector;;

public class SettlementConfirmDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();


	/**
	 * 宛先情報取得メソッド
	 *
	 *引数はsessionのemail
	 *@return destinationList<SettlementConfirmDTO>
	 */
	public ArrayList<SettlementConfirmDTO> getDestinationInfo(String email) {

		ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
		String sql = ""
				+ "SELECT id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address "
				+ "FROM destination_info "
				+ "where email = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet resultSet = ps.executeQuery();

			while(resultSet.next()) {
				SettlementConfirmDTO settlementConfirmDTO = new SettlementConfirmDTO();
				settlementConfirmDTO.setId(resultSet.getString("id"));
				settlementConfirmDTO.setFamilyName(resultSet.getString("family_name"));
				settlementConfirmDTO.setFirstName(resultSet.getString("first_name"));
				settlementConfirmDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				settlementConfirmDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				settlementConfirmDTO.setEmail(resultSet.getString("email"));
				settlementConfirmDTO.setTelNumber(resultSet.getString("tel_number"));
				settlementConfirmDTO.setUserAddress(resultSet.getString("user_address"));
				destinationList.add(settlementConfirmDTO);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return destinationList;
	}
	//在庫情報取得
	public int getCount(int productId){
		int count = 0;
		String sql="SELECT count FROM product_info where product_id=?";
		try{
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				count=resultSet.getInt("count");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//カート内商品購入個数変更
	public void updateBuyCount(String email,int productId,int count){
		String sql="UPDATE cart_info SET product_count=? WHERE email=? AND product_id=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, count);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//カートテーブル合計金額変更
	public void updateTotalPrice(String email,int productId,int count, int price){
		String sql="UPDATE cart_info SET total_price=? WHERE email=? AND product_id=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, count*price);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//非ログインカート内商品購入個数変更
	public void noLoginUpdateBuyCount(String tempUserId,int productId,int count){
		String sql="UPDATE cart_info SET product_count=? WHERE temp_user_id=? AND product_id=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, count);
			preparedStatement.setString(2, tempUserId);
			preparedStatement.setInt(3, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//非ログインカートテーブル合計金額変更
	public void noLoginUpdateTotalPrice(String tempUserId,int productId,int count, int price){
		String sql="UPDATE cart_info SET total_price=? WHERE temp_user_id=? AND product_id=?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, count*price);
			preparedStatement.setString(2, tempUserId);
			preparedStatement.setInt(3, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
