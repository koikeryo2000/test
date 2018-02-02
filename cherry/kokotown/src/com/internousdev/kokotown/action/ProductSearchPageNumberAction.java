package com.internousdev.kokotown.action;

import java.sql.SQLException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kokotown.dao.ProductSearchCountDAO;
import com.internousdev.kokotown.dao.ProductSearchDAO;
import com.internousdev.kokotown.dto.ProductInfoDTO;
import com.internousdev.kokotown.util.KanaUtils;
import com.opensymphony.xwork2.ActionSupport;

	public class ProductSearchPageNumberAction extends ActionSupport implements SessionAware{


		public Map<String,Object> session;

		//ジャンル検索
		private String categoryId;

		//検索ワード
		private String searchWord;

		//検索結果が全部で何ページか
		private int pageNumber;

		//検索結果の件数
		public int count;

		//何ページ目を表示するか
		private int page;

		private int dp1;

		private int dp2;




		/*並び順
		 * sortCategory商品名1　価格2　発売日3
		 * sortFlg  昇順1 降順0 の判別
		 * sortCategoryとsortFlgを元にsort（並び順）を決定
		 */
		private int sortCategory;
		private int sortFlg;
		private String sort;

		//１ページに何件表示するか
		private int display;

		private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

		public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		private ProductSearchCountDAO productSearchCountDAO = new ProductSearchCountDAO();






			/*
			 * 検索結果のページ間を移動するAction
			 * 移動先のページの商品情報取得
			 */
		public String execute()throws SQLException {

			String result = ERROR;






			//何件目からの商品情報を取得するか
			int pages=page*display;




			String keyWord = Normalizer.normalize(searchWord, Normalizer.Form.NFKC);

			keyWord=KanaUtils.toHiragana(keyWord);

			 //sortCategoryとsortFlgを元にsort（並び順）を決定
			switch(sortCategory){
			case 1:
				if(sortFlg==0){
				sort=" ORDER BY product_name_kana DESC";
				}else{
					sort=" ORDER BY product_name_kana";}
					break;

			case 2:
				if(sortFlg==0){
					sort=" ORDER BY price DESC";
					}else{
						sort=" ORDER BY price";}
						break;

			case 3:
				if(sortFlg==0){
					sort=" ORDER BY release_date DESC";
					}else{
						sort=" ORDER BY release_date";}
						break;

			}

			/*
			 *複数検索ワードをスペースで区切る配列
			 */
			String[] keyWords = keyWord.replace("|","hogehoge").replace("_","|_").replace("　"," ").replace("~","～").replace("%","|%").split("[\\s]+");

			count=productSearchCountDAO.getPuroductSerachCount(keyWords, categoryId);


			//商品情報取得
			productInfoDTOList =productSearchDAO.getPuroductSerachResult(keyWords, categoryId, pages, sortCategory, sort, display);




			//検索結果○件のうちdp1-dp2番目の商品表示
			 dp1=(pages)+1;

			int maxdp2 =count;

			dp2=(pages)+display;
			if(dp2>=maxdp2){
			dp2=maxdp2;
			};



			 result = SUCCESS;
			return result;
		}



		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}







		public int getPage() {
			return page;
		}

		public void setPage(int page) {
			this.page = page;
		}


		public String getCategoryId() {
			return categoryId;
		}



		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}



		public String getSearchWord() {
			return searchWord;
		}



		public void setSearchWord(String searchWord) {
			this.searchWord = searchWord;
		}







		@Override
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		public Map<String, Object> getSession() {
			return session;
		}



		public int getPageNumber() {
			return pageNumber;
		}



		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}



		public int getDisplay() {
			return display;
		}



		public void setDisplay(int display) {
			this.display = display;
		}



		public int getSortCategory() {
			return sortCategory;
		}



		public void setSortCategory(int sortCategory) {
			this.sortCategory = sortCategory;
		}



		public int getSortFlg() {
			return sortFlg;
		}



		public void setSortFlg(int sortFlg) {
			this.sortFlg = sortFlg;
		}



		public int getDp1() {
			return dp1;
		}



		public void setDp1(int dp1) {
			this.dp1 = dp1;
		}



		public int getDp2() {
			return dp2;
		}



		public void setDp2(int dp2) {
			this.dp2 = dp2;
		}



		public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
			return productInfoDTOList;
		}



		public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDTOList) {
			this.productInfoDTOList = productInfoDTOList;
		}










	}
