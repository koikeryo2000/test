package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.internousdev.kokotown.util.DBConnector;

public class ProductSearchDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	public ArrayList<ProductInfoDTO> producutSerachDTOList = new ArrayList<>();








/*検索結果（１ページに表示する商品情報取得）*/
	public ArrayList<ProductInfoDTO> getPuroductSerachResult(String[] keyWords, String categoryId, int page, int sortCategory, String sort, int display){






		try{

			/*
			 * 検索ワードの検索条件（1単語）
			 */
			String condition =" AND (product_name LIKE ?   ESCAPE '|' OR product_name_kana LIKE ?   ESCAPE '|')";

			/*
			 *複数検索条件
			 */
			String conditions = StringUtils.repeat(condition, keyWords.length);


			String sql =""
					+"SELECT product_info.id,product_id, product_name, product_name_kana,product_info.category_id, price, image_file_name, image_file_path,release_date, count"
					+" FROM product_info"
					+" INNER JOIN m_category"
					+" ON product_info.category_id = m_category.category_id"
					+" WHERE product_info.category_id LIKE ?"
					+ conditions
					+ sort
					+" LIMIT ? OFFSET ?"
					;




			PreparedStatement ps = con.prepareStatement(sql);
			//ひとつめはカテゴリIDで検索
			ps.setString(1, categoryId+"%");

			int i=0;
			int k=2;
			//kはsql文の何番目に入るかを決める、一つ目はカテゴリIDなので2
			while(i<keyWords.length){
				//正式名称とひらがなを両方検索するため2回セットする
				ps.setString(k++, "%"+keyWords[i]+"%");
				ps.setString(k++, "%"+keyWords[i]+"%");
				i++;
			}
			//2回セットするのでx2して、一つ目にカテゴリIDが入っているので、2番目にするために＋2
			ps.setInt((keyWords.length)*2+2,display);
			ps.setInt((keyWords.length)*2+3,page);
			ResultSet rs = ps.executeQuery();


		while(rs.next()){
			ProductInfoDTO dto = new ProductInfoDTO();
			dto.setId(rs.getInt("product_info.id"));
			dto.setProductId(rs.getInt("product_id"));
			dto.setProductName(rs.getString("product_name"));
			dto.setProductNameKana(rs.getString("product_name_kana"));
			dto.setCategoryId(rs.getInt("category_id"));
			dto.setPriceComma(String.format("¥ %,d", rs.getInt("price")));
			dto.setImageFileName(rs.getString("image_file_name"));
			dto.setImageFilePath(rs.getString("image_file_path"));
			dto.setReleaseDate(rs.getString("release_date"));
			dto.setStock(rs.getInt("count"));
			producutSerachDTOList.add(dto);

		}
	}catch(SQLException e){
		e.printStackTrace();
	}
		try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}

		return producutSerachDTOList;

 }




}



