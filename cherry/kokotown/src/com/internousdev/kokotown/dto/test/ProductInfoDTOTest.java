package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.ProductInfoDTO;

public class ProductInfoDTOTest {

	/**
	 *GetProductName
	 *
	 */


	@Test
	public void testGetProductName1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	/**
	 *SetProductName
	 *
	 */

	@Test
	public void testSetProductName1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}


	/**
	 *
	 *
	 * ProductNameKana
	 *
	 *
	 */

	@Test
	public void testGetProductNameKana1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	/**
	 * ProductNameKana
	 *
	 */

	@Test
	public void testSetProductNameKana1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetProductDescription1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual=dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetProductDescription1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual=dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductDescription8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}


	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetImageFilePath1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetImageFilePath1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}



	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetImageFileName1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetImageFileName1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}


	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetReleaseDate1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetReleaseDate1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}






	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetReleaseCompany1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetReleaseCompany1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}



	/**
	 *
	 *
	 *
	 *
	 *
	 */

	@Test
	public void testGetPriceComma1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceComma8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 */

	@Test
	public void testSetPriceComma1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma6(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma7(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceComma8(){
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	/**
	 * getInt用テンプレート
	 *
	 * Id
	 * ProductInfoDTO
	 *
	 */

	@Test
	public void testGetId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetId5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * setInt用テンプレート
	 *
	 */

	@Test
	public void testSetId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual=dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetId5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	/**
	 * getInt用テンプレート
	 *
	 * ProductId
	 * ProductInfoDTO
	 *
	 */

	@Test
	public void testGetProductId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProductId5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * setInt用テンプレート
	 *
	 */

	@Test
	public void testSetProductId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductId5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	/**
	 * getInt用テンプレート
	 *
	 * Price
	 * ProductInfoDTO
	 *
	 */

	@Test
	public void testGetPrice1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPrice5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * setInt用テンプレート
	 *
	 */

	@Test
	public void testSetPrice1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual=dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPrice5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	/**
	 * getInt用テンプレート
	 *
	 * Stock
	 * ProductInfoDTO
	 *
	 */

	@Test
	public void testGetStock1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setStock(expected);

		assertEquals(expected, dto.getStock());
	}

	@Test
	public void testGetStock2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setStock(expected);

		assertEquals(expected, dto.getStock());
	}

	@Test
	public void testGetStock3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setStock(expected);

		assertEquals(expected, dto.getStock());
	}

	@Test
	public void testGetStock4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setStock(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetStock5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setStock(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * setInt用テンプレート
	 *
	 */

	@Test
	public void testSetStock1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setStock(expected);
		int actual = dto.getStock();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStock2(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setStock(expected);
		int actual = dto.getStock();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStock3(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483647;

		dto.setStock(expected);
		int actual=dto.getStock();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStock4(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setStock(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetStock5(){
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setStock(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

}
