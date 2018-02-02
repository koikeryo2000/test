package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.ProductInfoDetailDTO;

public class ProductInfoDetailDTOTest{

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

	@Test

	public void testGetId1() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 0;
		dto.setId(test);
		assertEquals(test, dto.getId());
	}
	@Test
	public void testGetId2() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 2147483647;

		dto.setId(test);
		assertEquals(test, dto.getId());
	}
	@Test
	public void testGetId3() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = -2147483647;
		dto.setId(test);
		assertEquals(test, dto.getId());
	}
	@Test
	public void testGetId4() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("2147483649");
			dto.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483649\"");
		}
	}
	@Test
	public void testGetId5() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("-2147483649");
			dto.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}



	@Test
	public void testSetId1() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 0;
		dto.setId(test);
		int result = dto.getId();
		assertEquals(test, result);
	}
	@Test
	public void testSetId2() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 2147483647;
		dto.setId(test);
		int result = dto.getId();
		assertEquals(test, result);
	}
	@Test
	public void testSetId3() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = -2147483647;
		dto.setId(test);
		int result = dto.getId();
		assertEquals(test, result);
	}
	@Test
	public void testSetId4() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("2147483647");
			dto.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	@Test
	public void testSetId5() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			dto.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}


	@Test
//	public void testGetProductId() {
//		fail("まだ実装されていません");
//	}
	public void testGetProductId1() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 0;
		dto.setProductId(test);
		assertEquals(test, dto.getProductId());
	}
	@Test
	public void testGetProductId2() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = 2147483647;

		dto.setProductId(test);
		assertEquals(test, dto.getProductId());
	}
	@Test
	public void testGetProductId3() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int test = -2147483647;
		dto.setProductId(test);
		assertEquals(test, dto.getProductId());
	}
	@Test
	public void testGetProductId4() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("2147483649");
			dto.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483649\"");
		}
	}
	@Test
	public void testGetProductId5() {
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int test = Integer.parseInt("-2147483649");
			dto.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
//	public void testSetProductId() {
//		fail("まだ実装されていません");
//	}

	public void testSetProductId1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testsetProductId2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testsetProductId3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testsetProductId4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testsetProductId5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
//	public void testGetProductName() {
//		fail("まだ実装されていません");
//	}
	public void testGetProductName1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
//	public void testSetProductName() {
//		fail("まだ実装されていません");
//	}
	public void testSetProductName1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetProductNameKana() {
//		fail("まだ実装されていません");
//	}
	public void testGetProductNameKana1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}


	@Test
//	public void testSetProductNameKana() {
//		fail("まだ実装されていません");
//	}
	public void testSetProductNameKana1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetProductDescription() {
//		fail("まだ実装されていません");
//	}
	public void testGetProductDescription1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual=dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	@Test
//	public void testSetProductDescription() {
//		fail("まだ実装されていません");
//	}
	public void testSetProductDescription1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual=dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductDescription8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetPrice() {
//		fail("まだ実装されていません");
//	}

	public void testGetPrice1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPrice5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
//	public void testSetPrice() {
//		fail("まだ実装されていません");
//	}
	public void testSetPrice1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual=dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setPrice(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPrice5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setPrice(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


	@Test
//	public void testGetImageFilePath() {
//		fail("まだ実装されていません");
//	}
	public void testGetImageFilePath1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
//	public void testSetImageFilePath() {
//		fail("まだ実装されていません");
//	}
	public void testSetImageFilePath1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetImageFileName() {
//		fail("まだ実装されていません");
//	}
	public void testGetImageFileName1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}


	@Test
//	public void testSetImageFileName() {
//		fail("まだ実装されていません");
//	}
	public void testSetImageFileName1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetReleaseDate() {
//		fail("まだ実装されていません");
//	}
	public void testGetReleaseDate1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
//	public void testSetReleaseDate() {
//		fail("まだ実装されていません");
//	}
	public void testSetReleaseDate1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}


	@Test
//	public void testGetReleaseCompany() {
//		fail("まだ実装されていません");
//	}
	public void testGetReleaseCompany1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
//	public void testSetReleaseCompany() {
//		fail("まだ実装されていません");
//	}
	public void testSetReleaseCompany1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetListCount1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setListCount(expected);

		assertEquals(expected, dto.getListCount());
	}

	@Test
	public void testGetListCount2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setListCount(expected);

		assertEquals(expected, dto.getListCount());
	}

	@Test
	public void testGetListCount3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setListCount(expected);

		assertEquals(expected, dto.getListCount());
	}

	@Test
	public void testGetListCount4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setListCount(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetListCount5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setListCount(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetListCount1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setListCount(expected);
		int actual = dto.getListCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetListCount2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setListCount(expected);
		int actual = dto.getListCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetListCount3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setListCount(expected);
		int actual=dto.getListCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetListCount4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setListCount(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetListCount5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setListCount(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setProductCount(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProductCount5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual=dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setProductCount(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductCount5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPriceComma1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceComma8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceComma1(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma2(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma3(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma4(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma5(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma6(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma7(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceComma8(){
		ProductInfoDetailDTO dto = new ProductInfoDetailDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}
}
