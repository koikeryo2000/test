package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.PurchaseHistoryInfoDTO;

public class PurchaseHistoryInfoDTOTest {

	@Test
	public void testGetProductName1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}


	@Test
	public void testSetProductName1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetProductNameKana1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetProductNameKana1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetImageFilePath1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetImageFilePath1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetPrice1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual=dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetPrice1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual=dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetReleaseCompany1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetReleaseCompany1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetReleaseDate1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetReleaseDate1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}





	@Test
	public void testGetPriceComma1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceComma8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}



	@Test
	public void testSetPriceComma1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma2(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma3(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma4(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma5(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma6(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma7(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceComma8(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}
}
