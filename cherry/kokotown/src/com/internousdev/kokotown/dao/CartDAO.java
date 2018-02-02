package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.GoCartDTO;
import com.internousdev.kokotown.util.DBConnector;
import com.internousdev.kokotown.util.DateUtil;

/**
 *
 *
 */

public class CartDAO {
	private DBConnector db=new DBConnector();
	private Connection connection=db.getConnection();
	private DateUtil dateUtil=new DateUtil();

	//カートに商品を追加する=カートテーブルに情報を登録する

	public boolean addProduct(String email,int productId,String productCount,String totalPrice)throws SQLException{
		String sql="INSERT INTO cart_info(email,product_id,product_count,total_price,regist_date)"
				+"VALUES(?,?,?,?,?)";

		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,email);
			ps.setInt(2,productId);
			ps.setString(3,productCount);
			ps.setString(4,totalPrice);
			ps.setString(5,dateUtil.getDate());

			ps.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//（ログインしていないけどカートに追加する）
	public boolean noLoginedAddProduct(String tempUserId,int productId,String productCount,String totalPrice)throws SQLException{
		String sql="INSERT INTO cart_info(temp_user_id,product_id,product_count,total_price,regist_date)"
				+"VALUES(?,?,?,?,?)";

		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,tempUserId);
			ps.setInt(2,productId);
			ps.setString(3,productCount);
			ps.setString(4,totalPrice);
			ps.setString(5,dateUtil.getDate());

			ps.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}



	//カート情報読み込み(ログインしている)

	public ArrayList<GoCartDTO> getCartInfo(String email)throws SQLException{
		ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();
		String sql="SELECT * "
				+ "FROM cart_info LEFT JOIN product_info "
				+ "ON cart_info.product_id=product_info.product_id "
				+ "WHERE cart_info.email=?";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,email);

			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				GoCartDTO dto=new GoCartDTO();
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setPriceComma(String.format("¥ %,d", rs.getInt("price")));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setEmail(rs.getString("email"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setTotalPriceComma(String.format("¥ %,d", rs.getInt("total_price")));
				dto.setId(rs.getInt("id"));
				dto.setCategoryId(rs.getInt("category_id"));

				cartInfoList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cartInfoList;
	}

	//カート情報読み込み（ログインしていない）
	public ArrayList<GoCartDTO> getNoLoginedCartInfo(String tempUserId)throws SQLException{
		ArrayList<GoCartDTO> cartInfoList=new ArrayList<GoCartDTO>();
		String sql="SELECT * "
				+ "FROM cart_info LEFT JOIN product_info "
				+ "ON cart_info.product_id=product_info.product_id "
				+ "WHERE cart_info.temp_user_id=?";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,tempUserId);

			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				GoCartDTO dto=new GoCartDTO();
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setPriceComma(String.format("¥ %,d", rs.getInt("price")));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setTempUserId(rs.getString("temp_user_id"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setTotalPriceComma(String.format("¥ %,d", rs.getInt("total_price")));
				dto.setId(rs.getInt("id"));
				dto.setCategoryId(rs.getInt("category_id"));

				cartInfoList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cartInfoList;
	}

	//チェックを入れた商品を削除
	public boolean checkedItemDelete(String email,int id){
		String sql="DELETE FROM cart_info WHERE email=? AND id=?";

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
	//チェックを入れた商品を削除(ログインしていない)
	public boolean noLoginedCheckedItemDelete(String tempUserId,int id){
		String sql="DELETE FROM cart_info WHERE temp_user_id=? AND id=?";

		PreparedStatement ps;

		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ps.setInt(2, id);

			ps.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}

	//IDに紐づいた商品を全削除(ゲスト用)
	public boolean allItemDelete(String tempUserId){
		String sql="DELETE FROM cart_info WHERE temp_user_id=?";

		PreparedStatement ps;

		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, tempUserId);

			ps.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}


	//決済後のカート情報を削除
	public void deleteCartInfo(String email){

		String sql="DELETE FROM cart_info WHERE email=?";

		PreparedStatement ps;

		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, email);

			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	//カートの商品を決済後購入履歴に登録
	public void insertPurchaseHistory(String email,int productId,int productCount,int price){

		String sql="INSERT INTO purchase_history_info(email, product_id, product_count, price,regist_date) VALUES(?,?,?,?,?)";

		PreparedStatement ps;
		try {
			ps=connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setInt(2, productId);
			ps.setInt(3, productCount);
			ps.setInt(4, price);
			ps.setString(5,dateUtil.getDate());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	//決済時の在庫数変動
	public void updateStock(int productId,int stock,int buyCount){
		int updateStock = stock-buyCount;
		String sql="UPDATE product_info SET count=? WHERE product_id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, updateStock);
			preparedStatement.setInt(2, productId);
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}