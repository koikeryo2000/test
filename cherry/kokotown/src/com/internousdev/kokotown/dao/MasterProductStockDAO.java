package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.internousdev.kokotown.util.DBConnector;

public class MasterProductStockDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private String sql;




	public boolean ProdouctStock(int countAdd1, int productId1, int countAdd2, int productId2){




		try{
			sql="UPDATE product_info SET count =count + (?) where product_id= ?";

			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1, countAdd1);
			ps.setInt(2,productId1);
			ps.executeUpdate();

			sql="UPDATE product_info SET count =count + (?) where product_id= ?";

			PreparedStatement ps2 =con.prepareStatement(sql);
			ps2.setInt(1, countAdd2);
			ps2.setInt(2,productId2);
			ps2.executeUpdate();


			return true;

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}





	public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
	DBConnector dbConnector=new DBConnector();
	Connection connection=dbConnector.getConnection();
	//全商品の情報取得

	public ArrayList<ProductInfoDTO> allItem(){


		String sql=""
				+ "SELECT  * "
				+ "FROM product_info "
				+ "INNER JOIN m_category "
				+ "ON product_info.category_id = m_category.category_id "
				+ "ORDER BY product_id";


		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				productInfoDTO.setStock(resultSet.getInt("count"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTOList.add(productInfoDTO);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDTOList;
	}




	public boolean ProdouctStockAllChange(int countAddAll){


		try{
			sql="UPDATE product_info SET count = ?";

			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1, countAddAll);
			ps.executeUpdate();


			return true;

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}


}