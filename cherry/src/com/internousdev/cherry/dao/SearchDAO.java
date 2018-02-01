package com.internousdev.cherry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.cherry.dto.SearchDTO;
import com.internousdev.cherry.util.DBConnector;

public class SearchDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private ArrayList<SearchDTO> searchDTOList = new ArrayList<SearchDTO>();

	/**
	 * 全ての商品を表示
	 *
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> allProductInfo() {
		String sql = "SELECT*FROM product_info";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO searchDTO = new SearchDTO();
				searchDTO.setId(rs.getInt("id"));
				searchDTO.setProductId(rs.getInt("product_id"));
				searchDTO.setProductName(rs.getString("product_name"));
				searchDTO.setProductNameKana(rs.getString("product_name_kana"));
				searchDTO.setProductDescription(rs.getString("product_description"));
				searchDTO.setCategoryId(rs.getInt("category_id"));
				searchDTO.setPrice(rs.getInt("price"));
				searchDTO.setImageFileName(rs.getString("image_file_name"));
				searchDTO.setReleaseDate(rs.getDate("release_date"));
				searchDTO.setReleaseCompany(rs.getString("release_company"));
				searchDTO.setStatus(rs.getShort("status"));
				searchDTO.setRegistDate(rs.getDate("regist_date"));
				searchDTO.setUpdateDate(rs.getDate("update_date"));
				searchDTOList.add(searchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * 商品IDのみで検索
	 *
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> ByPrductId() {
		String sql = "SELECT*FROM product_info WHERE product_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));
				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * 検索ワードのみで検索
	 *
	 * @param serchWord
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> BySerchWord(String serchWord) {
		String sql = "SELECT*FROM product_info WHERE product_name LIKE \'%' ? \'%' ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, serchWord);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));

				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * カテゴリのみで検索
	 *
	 * @param categoryId
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> ByProductCategory(int categoryId) {
		String sql = "SELECT*FROM product_info WHERE category_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));

				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * カテゴリと検索ワード
	 *
	 * @param categoryId
	 * @param serchWord
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> ByCategoryANDSerchWord(int categoryId, String serchWord) {
		String sql = "SELECT*FROM product_info WHERE product_name LIKE \'%' ? \'%' AND category_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, serchWord);
			ps.setInt(2, categoryId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));

				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * ひらがな検索
	 *
	 * @param serchWord
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> BySerchWordKana(String serchWord) {
		String sql = "SELECT*FROM product_info WHERE product_name_kana LIKE \'%' ? \'%'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, serchWord);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));

				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

	/**
	 * カテゴリとカナで検索
	 *
	 * @param categoryId
	 * @param serchWord
	 * @return searchDTOList
	 */
	public ArrayList<SearchDTO> ByCategoryANDSerchWordKana(int categoryId, String serchWord) {
		String sql = "SELECT*FROM product_info WHERE product_name_kana LIKE \'%' ? \'%' AND category_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, serchWord);
			ps.setInt(2, categoryId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SearchDTO serchDTO = new SearchDTO();
				serchDTO.setId(rs.getInt("id"));
				serchDTO.setProductId(rs.getInt("product_id"));
				serchDTO.setProductName(rs.getString("product_name"));
				serchDTO.setProductNameKana(rs.getString("product_name_kana"));
				serchDTO.setProductDescription(rs.getString("product_description"));
				serchDTO.setCategoryId(rs.getInt("category_id"));
				serchDTO.setPrice(rs.getInt("price"));
				serchDTO.setImageFileName(rs.getString("image_file_name"));
				serchDTO.setReleaseDate(rs.getDate("release_date"));
				serchDTO.setReleaseCompany(rs.getString("release_company"));
				serchDTO.setStatus(rs.getShort("status"));
				serchDTO.setRegistDate(rs.getDate("regist_date"));
				serchDTO.setUpdateDate(rs.getDate("update_date"));

				searchDTOList.add(serchDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDTOList;

	}

}
