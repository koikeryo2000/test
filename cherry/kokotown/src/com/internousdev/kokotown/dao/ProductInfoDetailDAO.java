package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.ProductInfoDetailDTO;
import com.internousdev.kokotown.util.DBConnector;

public class ProductInfoDetailDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	public ProductInfoDetailDTO productInfoDetailDTO=new ProductInfoDetailDTO();

	//商品詳細を取得
	public ArrayList<ProductInfoDetailDTO> getDetail(int productId) throws SQLException{
		ArrayList<ProductInfoDetailDTO> detailList = new ArrayList<ProductInfoDetailDTO>();
		String sql=""
				+ "SELECT  * "
				+ "FROM product_info "
				+ "INNER JOIN m_category "
				+ "ON product_info.category_id = m_category.category_id "
				+ "where product_id = ?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductInfoDetailDTO getItem = new ProductInfoDetailDTO();
				getItem.setId(resultSet.getInt("product_info.id"));
				getItem.setProductId(resultSet.getInt("product_id"));
				getItem.setProductName(resultSet.getString("product_name"));
				getItem.setProductNameKana(resultSet.getString("product_name_kana"));
				getItem.setProductDescription(resultSet.getString("product_description"));
				getItem.setCategoryId(resultSet.getInt("product_info.category_id"));
				getItem.setCategoryName(resultSet.getString("category_name"));
				getItem.setCategoryDescription(resultSet.getString("category_description"));
				getItem.setPrice(resultSet.getInt("price"));
				getItem.setPriceComma(String.format("¥ %,d", resultSet.getInt("price")));
				getItem.setProductCount(resultSet.getInt("count"));
				getItem.setImageFilePath(resultSet.getString("image_file_path"));
				getItem.setImageFileName(resultSet.getString("image_file_name"));
				getItem.setReleaseDate(resultSet.getString("release_date"));
				getItem.setReleaseCompany(resultSet.getString("release_company"));
				detailList.add(getItem);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return detailList;
	}
	//同じカテゴリーの商品を取得
	public ArrayList<ProductInfoDetailDTO> sameCategoryList(int categoryId,int removeId) throws SQLException{
		ArrayList<ProductInfoDetailDTO> sameCategoryList = new ArrayList<ProductInfoDetailDTO>();
		String sql = ""
				+ "SELECT * "
				+ "FROM product_info "
				+ "INNER JOIN m_category "
				+ "ON product_info.category_id = m_category.category_id "
				+ "WHERE product_info.category_id=? "
				+ "AND product_info.id !=? "
				+ "ORDER BY RAND() "
				+ "LIMIT 3 ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,categoryId);
			preparedStatement.setInt(2, removeId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){


				ProductInfoDetailDTO item = new ProductInfoDetailDTO();
				item.setId(resultSet.getInt("product_info.id"));
				item.setProductId(resultSet.getInt("product_id"));
				item.setProductName(resultSet.getString("product_name"));
				item.setProductNameKana(resultSet.getString("product_name_kana"));
				item.setProductDescription(resultSet.getString("product_description"));
				item.setCategoryId(resultSet.getInt("product_info.category_id"));
				item.setCategoryName(resultSet.getString("category_name"));
				item.setPrice(resultSet.getInt("price"));
				item.setPriceComma(String.format("¥ %,d", resultSet.getInt("price")));
				item.setProductCount(resultSet.getInt("count"));
				item.setImageFilePath(resultSet.getString("image_file_path"));
				item.setImageFileName(resultSet.getString("image_file_name"));
				item.setReleaseDate(resultSet.getString("release_date"));
				item.setReleaseCompany(resultSet.getString("release_company"));

				sameCategoryList.add(item);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return sameCategoryList;
	}


}


