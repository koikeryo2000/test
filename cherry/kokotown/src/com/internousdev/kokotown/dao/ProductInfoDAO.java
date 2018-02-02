package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kokotown.dto.CategoryDTO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.internousdev.kokotown.util.DBConnector;

public class ProductInfoDAO {



	public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
	DBConnector dbConnector=new DBConnector();
	Connection connection=dbConnector.getConnection();
	//全商品の情報取得

	public ArrayList<ProductInfoDTO> allItem(int page){


		String sql=""
				+ "SELECT  * "
				+ "FROM product_info "
				+ "INNER JOIN m_category "
				+ "ON product_info.category_id = m_category.category_id "
				+ "LIMIT ?, ?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*9);
			preparedStatement.setInt(2, 9);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setId(resultSet.getInt("product_info.id"));
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				productInfoDTO.setCategoryName(resultSet.getString("category_name"));
				productInfoDTO.setCategoryDescription(resultSet.getString("category_description"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFilePath(resultSet.getString("image_file_path"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDTO.setReleaseDate(resultSet.getString("release_date"));
				productInfoDTO.setReleaseCompany(resultSet.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDTOList;
	}
	public int getListSize() throws SQLException{
		String sql="SELECT count(*) FROM product_info";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			return resultSet.getInt("count(*)");
		}
		return 0;
	}
	public ArrayList<CategoryDTO> getCategory() throws SQLException{
		ArrayList<CategoryDTO> list = new ArrayList<>();

		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setCategoryId(0);
		categoryDTO.setCategoryName("すべてのカテゴリー");
		categoryDTO.setCategoryDescription("すべてのカテゴリーです");
		list.add(categoryDTO);

		String sql = ""
				+ "SELECT * "
				+ "FROM m_category ";

		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			CategoryDTO dto = new CategoryDTO();
			dto.setCategoryId(resultSet.getInt("category_id"));
			dto.setCategoryName(resultSet.getString("category_name"));
			dto.setCategoryDescription(resultSet.getString("category_description"));
			list.add(dto);
		}
		return list;
	}
}
