package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.internousdev.kokotown.util.DBConnector;

public class AdministratorProductAddDAO {

	DBConnector db=new DBConnector();
	Connection con= null;

	/**
	 * 商品追加
	 */
	public boolean ProductAdd(ProductInfoDTO dto) throws SQLException{
		boolean result=false;
		int updateCount=0;

		String sql="INSERT INTO product_info( product_name, product_name_kana, product_description, category_id, price, count, image_file_path, image_file_name, release_date, release_company, regist_date, product_id) "
				+ " VALUES( ?, ?, ?, ?, ?, ?, ?, ?, CAST(? AS DATE) ,?, NOW(), ?)";
		//			+ " INNER JOIN m_category"
		//			+" ON product_info.category_id = m_category.category_id";
		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, dto.getProductName());
			ps.setString(2, dto.getProductNameKana());
			ps.setString(3, dto.getProductDescription());
			ps.setInt(4, dto.getCategoryId());
			ps.setInt(5, dto.getPrice());
			ps.setInt(6, dto.getStock());
			ps.setString(7, dto.getImageFilePath());
			ps.setString(8, dto.getImageFileName());
			ps.setString(9, dto.getReleaseDate());
			ps.setString(10, dto.getReleaseCompany());
			ps.setInt(11, dto.getProductId());

			updateCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		if(updateCount == 1) {
			result = true;
		}

		return result;
	}


}