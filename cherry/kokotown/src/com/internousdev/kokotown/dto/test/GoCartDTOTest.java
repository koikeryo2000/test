package com.internousdev.kokotown.dto.test;

import org.junit.Test;

import com.internousdev.kokotown.dto.GoCartDTO;

import junit.framework.TestCase;

public class GoCartDTOTest extends TestCase{


/**
  * 仮ユーザーIDを取得するメソッド
  * @return TempUserId 仮ユーザーID
  */

	public void testGetTempUserId1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}
	public void testGetTempUserId2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

	public void testGetTempUserId3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}
	public void testGetTempUserId4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

	public void testGetTempUserId5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

	public void testGetTempUserId6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

	public void testGetTempUserId7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

	public void testGetTempUserId8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);
	}

/**
  * 仮ユーザーIDを格納するメソッド
  * @param TempUserId セットする 仮ユーザーID
  */

	public void testSetTempUserId1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}

	public void testSetTempUserId2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}

	public void testSetTempUserId3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}
	public void testSetTempUserId4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}

	public void testSetTempUserId5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}
	public void testSetTempUserId6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}

	public void testSetTempUserId7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}

	public void testSetTempUserId8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();

		assertEquals(expected, actual);

	}


/**
  * 商品名を取得するメソッド
  * @return ProductName 商品名
  */

	public void testGetProductName1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

	public void testGetProductName8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);

	}

/**
  * 商品名を格納するメソッド
  * @param ProductName セットする 商品名
  */

	public void testSetProductName1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

	public void testSetProductName8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();

		assertEquals(expected, actual);
	}

/**
 * 商品かな get*/


	public void testGetProductNameKana1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testGetProductNameKana8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}



/**
 * 商品かな set*/

	public void testSetProductNameKana1() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}
	public void testSetProductNameKana2() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana3() {
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana4() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana5() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana6() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana7() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}

	public void testSetProductNameKana8() {
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();

		assertEquals(expected, actual);
	}


/*画像 get*/

	public void testGetImageFilePath1(){
			GoCartDTO dto = new GoCartDTO();
			String expected = null;

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath2(){
			GoCartDTO dto = new GoCartDTO();
			String expected = "";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath3(){
			GoCartDTO dto = new GoCartDTO();
			String expected = " ";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath4(){
			GoCartDTO dto = new GoCartDTO();
			String expected ="　";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath5(){
			GoCartDTO dto = new GoCartDTO();
			String expected = "abc123";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath6(){
			GoCartDTO dto = new GoCartDTO();
			String expected = "あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFilePath7(){
			GoCartDTO dto = new GoCartDTO();
			String expected = "abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath8(){
			GoCartDTO dto = new GoCartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();

			assertEquals(expected,actual);
		}



/*画像 set*/

	public void testSetImageFilePath1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}


/*画像 set*/

	public void testsetImageFilePath1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected, actual);
	}


	public void testsetImageFilePath7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}


	public void testsetImageFilePath8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();

		assertEquals(expected,actual);
	}


/*値段 get*/

	public void testGetPrice1() {
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());

	}

	public void testGetPrice2() {
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());

	}

	public void testGetPrice3() {
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());

	}

	public void testGetPrice4() throws Exception {
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");

			dto.setPrice(postalMin);

		}catch (RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testGetPrice5() throws Exception {
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMax = Integer.parseInt("2147483649");

			dto.setPrice(postalMax);

		}catch (RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483649\"");
		}
	}

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

/*値段 set*/


	public void testSetPrice1() {
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	public void testSetPrice2() {
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	public void testSetPrice3() {
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	public void testSetPrice4() throws Exception {
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");

			dto.setPrice(postalMin);

		}catch (RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testSetPrice5() throws Exception {
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMax = Integer.parseInt("2147483649");

			dto.setPrice(postalMax);

		}catch (RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483649\"");
		}
	}


/*会社 get*/

	public void testGetReleaseCompany1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}



/*会社 set*/

	public void testSetReleaseCompany1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();

		assertEquals(expected,actual);
	}


/*日付 get*/

	public void testGetReleaseDate1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

/*日付 set*/

	public void testSetReleaseDate1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();

		assertEquals(expected,actual);
	}


/*ID get*/

	public void testGetId1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetId5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


/*ID set*/

	public void testSetId1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual=dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetId5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


/*商品ID get*/

	public void testGetProductId1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProductId5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

/*商品 set*/

	public void testSetProductId1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductId5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


/*メール get*/

	public void testGetEmail1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}


/*メール set*/

	public void testSetEmail1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}



/*	数 get*/
	public void testGetProductCount1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setProductCount(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProductCount5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


/*数 set*/

	public void testSetProductCount1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual=dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setProductCount(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductCount5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


/*トータル get*/

	public void testGetTotalPrice1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTotalPrice(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetTotalPrice5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setTotalPrice(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/*トータル set*/
	public void testSetTotalPrice1(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPrice2(){
		GoCartDTO dto = new GoCartDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPrice3(){
		GoCartDTO dto = new GoCartDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);
		int actual=dto.getTotalPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPrice4(){
		GoCartDTO dto = new GoCartDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setTotalPrice(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetTotalPrice5(){
		GoCartDTO dto = new GoCartDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setTotalPrice(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}


/* PriceComma get */


	public void testGetPriceComma1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPriceComma7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceComma8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}


/*PriceComma set*/


	public void testSetPriceComma1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setPriceComma(expected);
		String actual=dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPriceComma7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceComma8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPriceComma(expected);
		String actual = dto.getPriceComma();

		assertEquals(expected,actual);
	}


/*TotalPriceComma get*/

	public void testGetTotalPriceComma1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setTotalPriceComma(expected);
		String actual=dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPriceComma7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPriceComma8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected,actual);
	}


/*TotalPriceComma set*/

	public void testSetTotalPriceComma1(){
		GoCartDTO dto = new GoCartDTO();
		String expected = null;

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma2(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma3(){
		GoCartDTO dto = new GoCartDTO();
		String expected = " ";

		dto.setTotalPriceComma(expected);
		String actual=dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma4(){
		GoCartDTO dto = new GoCartDTO();
		String expected ="　";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma5(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma6(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "あいう１２３";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPriceComma7(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalPriceComma8(){
		GoCartDTO dto = new GoCartDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTotalPriceComma(expected);
		String actual = dto.getTotalPriceComma();

		assertEquals(expected,actual);
	}


}
