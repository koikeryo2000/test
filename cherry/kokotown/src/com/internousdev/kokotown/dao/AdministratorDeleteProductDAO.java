package com.internousdev.kokotown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.kokotown.util.DBConnector;

public class AdministratorDeleteProductDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private String sql;

	public boolean ProdouctDelete(int productId1, int productId2, int productId3, int productId4, int productId5){


		try{
			sql="DELETE FROM product_info WHERE product_id IN (?,?,?,?,?)";

			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1,productId1);
			ps.setInt(2,productId2);
			ps.setInt(3,productId3);
			ps.setInt(4,productId4);
			ps.setInt(5,productId5);

			ps.executeUpdate();

			return true;

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}



}
