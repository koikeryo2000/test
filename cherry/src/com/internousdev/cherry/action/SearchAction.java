package com.internousdev.cherry.action;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.cherry.dao.SearchDAO;
import com.internousdev.cherry.dto.SearchDTO;
import com.internousdev.cherry.util.ToHiragana;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport implements SessionAware {
	private String searchWord;
	private int categoryId;
	private SearchDAO searchDAO = new SearchDAO();
	private ArrayList<SearchDTO> searchDTOList = new ArrayList<SearchDTO>();
	private ToHiragana toHiragana = new ToHiragana();
	public Map<String, Object> session;
	private ArrayList<String> msgList = new ArrayList<String>();

	public String execute() {
		String ret = ERROR;

		if (searchWord.length() > 16) {
			msgList.add("16字以内で検索してください");
		} else {
			msgList.add(searchWord);
		}

		/*---------------------------------------------------------
				検索値を全て全角ひらがな、全角カタカナに変換
		-----------------------------------------------------------*/

		searchWord = Normalizer.normalize(searchWord, Normalizer.Form.NFKC);
		System.out.println(searchWord);

		/*---------------------------------------------------------
				全件検索(カテゴリ、検索値なし)
		-----------------------------------------------------------*/

		if (categoryId == 1 && searchWord.isEmpty()) {
			setSearchDTOList(searchDAO.allProductInfo());
			ret = SUCCESS;

		}

		/*---------------------------------------------------------
				ひらがな、カタカナ検索
		-----------------------------------------------------------*/
		else if (categoryId == 1
				&& (searchWord.matches("^[\\u3040-\\u309F]+$") || searchWord.matches("^[\\u30A0-\\u30FF]+$"))) {
			searchWord = toHiragana.toZenkakuHiragana(searchWord);
			System.out.println(searchWord);
			setSearchDTOList(searchDAO.BySerchWordKana(searchWord));
			ret = SUCCESS;

		} else if (categoryId > 1
				&& (searchWord.matches("^[\\u3040-\\u309F]+$") || searchWord.matches("^[\\u30A0-\\u30FF]+$"))) {
			searchWord = toHiragana.toZenkakuHiragana(searchWord);
			System.out.println(searchWord);
			setSearchDTOList(searchDAO.ByCategoryANDSerchWordKana(categoryId, searchWord));
			ret = SUCCESS;

		}

		/*---------------------------------------------------------
				カテゴリ有り、検索値なし
		-----------------------------------------------------------*/
		else if (categoryId > 1 && searchWord.isEmpty()) {

			setSearchDTOList(searchDAO.ByProductCategory(categoryId));
			ret = SUCCESS;
		}

		/*---------------------------------------------------------
				カテゴリなし、検索値あり
		-----------------------------------------------------------*/
		else if (categoryId == 1 && !(searchWord.isEmpty())) {
			setSearchDTOList(searchDAO.BySerchWord(searchWord));
			ret = SUCCESS;
		}

		/*---------------------------------------------------------
				カテゴリあり、検索値あり
		-----------------------------------------------------------*/
		else {
			setSearchDTOList(searchDAO.ByCategoryANDSerchWord(categoryId, searchWord));
			ret = SUCCESS;

		}
		return ret;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public SearchDAO getSearchDAO() {
		return searchDAO;
	}

	public void setSearchDAO(SearchDAO searchDAO) {
		this.searchDAO = searchDAO;
	}

	public ArrayList<SearchDTO> getSearchDTOList() {
		return searchDTOList;
	}

	public void setSearchDTOList(ArrayList<SearchDTO> searchDTOList) {
		this.searchDTOList = searchDTOList;
	}

	public ToHiragana getToHiragana() {
		return toHiragana;
	}

	public void setToHiragana(ToHiragana toHiragana) {
		this.toHiragana = toHiragana;
	}

	public ArrayList<String> getMsgList() {
		return msgList;
	}

	public void setMsgList(ArrayList<String> msgList) {
		this.msgList = msgList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
