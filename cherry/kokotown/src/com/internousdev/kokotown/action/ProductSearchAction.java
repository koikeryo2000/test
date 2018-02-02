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



/**
 * @author shibuyamakoto
 * 検索フォームから送られるsearchwWordとcategoryIdを元に実行される検索Action
 *
 * デフォルト
 *発売日 降順
 *9件表示　１ページ目を表示
 */
public class ProductSearchAction extends ActionSupport implements SessionAware {


	//ジャンル検索
	private String categoryId;

	//検索ワード
	private String searchWord;

	//検索結果が全部で何ページか
	private int pageNumber;

	// 何ページ目を表示するか　page＋１頁が表示
	private int page=0;

	//検索結果のヒット件数
	private int count;



	/*並び順
	 * sortCategory商品名1　価格2　発売日3
	 * sort Flg  昇順1 降順0 の判別
	 */
	private int sortCategory=3;
	private int sortFlg=0;

	/*
	 * 昇順　降順切り替え判定
	 * flag判定値(このクラスでは未使用)
	 * judge判定元
	 */

	private int judge=0;

	//１ページに何件表示するか
	private int display=9;

	//検索結果○件のうちdp1-dp2番目の商品表示
	int dp1;

	int dp2;


	//並び順
	private String sort=" ORDER BY release_date DESC";



	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private ProductSearchCountDAO productSearchCountDAO = new ProductSearchCountDAO();

	public ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();



	private Map<String, Object> session;


	/*
	 * 検索ボタンをクリックすると実行されるメソッド
	 * 表示形式　発売日　降順　9件表示
	 *1-9件表示
	 *検索でヒットした商品の数
	 *ページ数
	 *
	 * */
	public String execute() throws SQLException{


		//半角ｶﾅを全角カナ、①→1等の変換
		String keyWord = Normalizer.normalize(searchWord, Normalizer.Form.NFKC);


		//全角カナを平仮名に変換
		keyWord=KanaUtils.toHiragana(keyWord);



		/*
		 *複数検索ワードをスペースで区切る配列
		 *replace("~","～")はnormalizeで～が~になってしまうのでもどしている
		 */
		String[] keyWords = keyWord.replace("|","hogehoge|").replace("_","|_").replace("　"," ").replace("~","～").replace("%","|%").split("[\\s]+");

		//1ページに表示される商品情報取得
		productInfoDTOList =productSearchDAO.getPuroductSerachResult(keyWords, categoryId, page, sortCategory, sort, display);

		//検索結果の商品の数
		count=productSearchCountDAO.getPuroductSerachCount(keyWords, categoryId);


		//全部で何ページになるか
		if(count%display==0){
			pageNumber=(count/display);}
		else{
		pageNumber=(int)(count/display)+1;}

		dp1=1;
		dp2=(page)+display;
		if(dp2>=count){
		dp2=count;
		};


		session.put("sortCategory", sortCategory);
		session.put("sortFlg", sortFlg);
		session.put("judge",judge);

		String result = SUCCESS;
		return result;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setSearchWord(String searchWord){
		this.searchWord = searchWord;
	}

	public String getSearchWord(){
		return searchWord;
	}



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
