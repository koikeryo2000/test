package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import com.internousdev.kokotown.util.DBConnector;


public class ProductSearchCountDAO {





	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();





	/*検索結果の商品数と表示する際のページ数取得*/

	public int getPuroductSerachCount(String[] keyWords, String categoryId)throws SQLException{




		int count=0;



		String condition =" AND (product_name LIKE ?   ESCAPE '|' OR product_name_kana LIKE ?   ESCAPE '|')";



		String conditions = StringUtils.repeat(condition, keyWords.length);




		try{
			String sql =""
					+"SELECT COUNT(*)"
					+" FROM product_info"
					+" INNER JOIN m_category"
					+" ON product_info.category_id = m_category.category_id"
					+" WHERE product_info.category_id LIKE ?"
					+ conditions;




			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, categoryId+"%");
			int i=0;
			int k=2;
			while(i<keyWords.length){
				ps.setString(k++, "%"+keyWords[i]+"%");
				ps.setString(k++, "%"+keyWords[i]+"%");
				i++;
			}


			ResultSet rs = ps.executeQuery();



			if(rs.next()){
				count=rs.getInt(1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}


		return count;


	}



	public int getPuroductStockCount(int productId)throws SQLException{



		//在庫数
		int stock=0;




		try{
			String sql =""
					+"SELECT count"
					+" FROM product_info"
					+" where product_id= ?";



			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);



			ResultSet rs = ps.executeQuery();



			if(rs.next()){
				stock=rs.getInt("count");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}



		return stock;


	}

}
