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

public class ProductSearchSortAction  extends ActionSupport implements SessionAware{



		//検索するジャンル
		private String categoryId;


		//検索ワード
		private String searchWord;

		//何ページ目を表示するか
		private int page;

		//1ページに表示する件数
		private int display;


		//ジャンル検索
		private int sortCategory;

		//昇順　降順切り替え判定
		private int flag;

		//
		private int judge;

		private int sortFlg;

		private String sort;



		//検索結果が全部で何ページか
		private int pageNumber;

		private int dp1;

		private int dp2;

		private int count;

		private ProductSearchCountDAO productSearchCountDAO = new ProductSearchCountDAO();





		private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

		public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();



		private Map<String, Object> session;



		/*
		 *
		 * 検索結果をソートするAction
		 * 価格
		 * 発売日
		 * 商品名
		 * 昇順
		 * 降順
		 *
		 *ソートした1頁目の商品情報を取得
		 * */
		public String execute() throws SQLException{





			page=0;


			if(sortCategory==Integer.parseInt(session.get("sortCategory").toString())){

			judge=Integer.parseInt(session.get("judge").toString());

			judge=(judge^flag);

			switch(judge){
				case 0:
					sortFlg=0;
					break;
				case 1:
					sortFlg=1;
					break;
				}
			}else{sortFlg=0;}


			String keyWord = Normalizer.normalize(searchWord, Normalizer.Form.NFKC);

			keyWord=KanaUtils.toHiragana(keyWord);

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





			productInfoDTOList =productSearchDAO.getPuroductSerachResult(keyWords, categoryId, page, sortCategory, sort, display);

			//検索結果の商品の数
			count=productSearchCountDAO.getPuroductSerachCount(keyWords, categoryId);


			//ソート情報
			session.put("sortCategory", sortCategory);
			session.put("judge",judge);
			session.put("sortFlg",sortFlg);



			dp1=(page)+1;

			int maxdp2 =count;

			 dp2=(page)+display;
			if(dp2>=maxdp2){
			dp2=maxdp2;
			}


			String result = SUCCESS;

			return result;

		}







		public int getSortCategory() {
			return sortCategory;
		}

		public void setSortCategory(int sortCategory) {
			this.sortCategory = sortCategory;
		}







		public int getFlag() {
			return flag;
		}

		public void setFlag(int flag) {
			this.flag = flag;
		}




		public void setSession(Map<String, Object> session) {
			this.session = session;
		}


		public Map<String, Object> getSession() {
			return session;
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







		public int getDisplay() {
			return display;
		}







		public void setDisplay(int display) {
			this.display = display;
		}







		public int getSortFlg() {
			return sortFlg;
		}







		public void setSortFlg(int sortFlg) {
			this.sortFlg = sortFlg;
		}







		public int getPageNumber() {
			return pageNumber;
		}







		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
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







		public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
			return productInfoDTOList;
		}







		public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDTOList) {
			this.productInfoDTOList = productInfoDTOList;
		}




















	}


