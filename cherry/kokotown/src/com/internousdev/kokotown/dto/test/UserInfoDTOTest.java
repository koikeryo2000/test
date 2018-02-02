package com.internousdev.kokotown.dto.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.kokotown.dto.UserInfoDTO;

public class UserInfoDTOTest {

	/**
	 * getInt用テンプレート
	 *
	 * Id
	 * UserInfoDTO
	 *
	 */

	@Test
	public void testGetId1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4(){
		UserInfoDTO dto = new UserInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		}catch(RuntimeException e){
			assertThat(e.getMessage(),is("For input string: \"-2147483649\""));
		}
	}

	@Test
	public void testGetId5(){
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
			assertThat(e.getMessage(), is("For input string: \"2147483648\""));
		}
	}

	/**
	 * setInt用テンプレート
	 *
	 */

	@Test
	public void testSetId1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual=dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4(){
		UserInfoDTO dto = new UserInfoDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),is("For input string: \"-2147483649\""));
		}
	}

	@Test
	public void testSetId5(){
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int postalMax= Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch (RuntimeException e) {
			assertThat(e.getMessage(),is("For input string: \"2147483648\""));
		}
	}


	/**
	 *
	 *
	 * GetEmail
	 *
	 *
	 */

	@Test
	public void testGetEmail1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	/**
	 * SetEmail
	 *
	 */

	@Test
	public void testSetEmail1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}



	/**
	 *
	 *
	 * GetPassword
	 *
	 *
	 */

	@Test
	public void testGetPassword1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual=dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected,actual);
	}

	/**
	 * SetPassword
	 *
	 */

	@Test
	public void testSetPassword1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual=dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();

		assertEquals(expected,actual);
	}

	/**
	 *
	 *
	 * GetFamilyName
	 *
	 *
	 */

	@Test
	public void testGetFamilyName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}

	/**
	 * SetFamilyName
	 *
	 */

	@Test
	public void testSetFamilyName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}




	/**
	 *
	 *
	 * GetFirstName
	 *
	 *
	 */

	@Test
	public void testGetFirstName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}

	/**
	 * SetFirstName
	 *
	 */

	@Test
	public void testSetFirstName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}




	/**
	 *
	 *
	 * GetFamilyNameKana
	 *
	 *
	 */

	@Test
	public void testGetFamilyNameKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}

	/**
	 * SetFamilyNameKana
	 *
	 */

	@Test
	public void testSetFamilyNameKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}




	/**
	 *
	 *
	 * GetFirstNameKana
	 *
	 *
	 */

	@Test
	public void testGetFirstNameKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	/**
	 * SetFirstNameKana
	 *
	 */

	@Test
	public void testSetFirstNameKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	/*
	 *
	 *boolean Sex
	 *
	 */
		@Test
		public void testIsSex() {
	        UserInfoDTO test = new UserInfoDTO();
	        boolean expected = true;
	        test.setSex(expected);
	        boolean actual = test.getSex();
	        assertEquals(expected, actual);
	    }
		@Test
	    public void testIsSex2() {
	        UserInfoDTO test = new UserInfoDTO();
	        boolean expected = false;
	        test.setSex(expected);
	        boolean actual = test.getSex();
	        assertEquals(expected, actual);
	    }
		@Test
	    public void testSetSex() {
	        UserInfoDTO test = new UserInfoDTO();
	        boolean expected = true;
	        test.setSex(expected);
	        boolean actual = test.getSex();
	        assertEquals(expected, actual);
	    }

		@Test
	    public void testSetSex2() {
	        UserInfoDTO test = new UserInfoDTO();
	        boolean expected = false;
	        test.setSex(expected);
	        boolean actual = test.getSex();
	        assertEquals(expected, actual);
		}

		/**
		 * getBoolean用テンプレート
		 *
		 * Status
		 * UserInfoDTO
		 *
		 */

		@Test
		public void testIsStatus1(){
			UserInfoDTO dto = new UserInfoDTO();
	        boolean expected = true;
	        dto.setStatus(expected);
	        boolean actual = dto.isStatus();
	        assertEquals(expected, actual);
		}

		@Test
		public void testIsStatus2(){
			UserInfoDTO dto = new UserInfoDTO();
			boolean expected = false;
	        dto.setStatus(expected);
	        boolean actual = dto.isStatus();
	        assertEquals(expected, actual);
		}


		/**
		 * setBoolean用テンプレート
		 *
		 */

		@Test
		public void testSetStatus1(){
			UserInfoDTO dto = new UserInfoDTO();
	        boolean expected = true;
	        dto.setStatus(expected);
	        boolean actual = dto.isStatus();
	        assertEquals(expected, actual);
		}

		@Test
		public void testSetStatus2(){
			UserInfoDTO dto = new UserInfoDTO();
			boolean expected = false;
	        dto.setStatus(expected);
	        boolean actual = dto.isStatus();
	        assertEquals(expected, actual);
		}

		/**
		 * getBoolean用テンプレート
		 *
		 * Logined
		 * UserInfoDTO
		 *
		 */

		@Test
		public void testIsLogined1(){
			UserInfoDTO dto = new UserInfoDTO();
	        boolean expected = true;
	        dto.setLogined(expected);
	        boolean actual = dto.isLogined();
	        assertEquals(expected, actual);
		}

		@Test
		public void testIsLogined2(){
			UserInfoDTO dto = new UserInfoDTO();
			boolean expected = false;
	        dto.setLogined(expected);
	        boolean actual = dto.isLogined();
	        assertEquals(expected, actual);
		}


		/**
		 * setBoolean用テンプレート
		 *
		 */

		@Test
		public void testSetLogined1(){
			UserInfoDTO dto = new UserInfoDTO();
	        boolean expected = true;
	        dto.setLogined(expected);
	        boolean actual = dto.isLogined();
	        assertEquals(expected, actual);
		}

		@Test
		public void testSetLogined2(){
			UserInfoDTO dto = new UserInfoDTO();
			boolean expected = false;
	        dto.setLogined(expected);
	        boolean actual = dto.isLogined();
	        assertEquals(expected, actual);
		}

		/**
		 * getDate
		 * Register_date
		 */

		@Test
		public void testGetRegister_date1() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate = "1000/01/01 00:00:00";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
			try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setRegister_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
			}
		}

		@Test
		public void testGetRegister_date2() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate = "9999/12/31 23:59:59";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
			try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setRegister_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
			}
		}

		/**
		 * setDate
		 * Register_date
		 */

		@Test
		public void testSetRegister_date1() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate ="1000/01/01 00:00:00";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
	         try {
	 			dateTest = sdFormat.parse(expectedDate);
	 				dto.setRegister_date(dateTest);
	 		} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
			}
	 	}

		@Test
		public void testSetRegister_date2() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate ="9999/12/31 23:59:59";
	        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	        Date dateTest;
	        try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setRegister_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
			}
		}

		/**
		 * getDate
		 * Update_date
		 */

		@Test
		public void testGetUpdate_date1() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate = "1000/01/01 00:00:00";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
			try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setUpdate_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
			}
		}

		@Test
		public void testGetUpdate_date2() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate = "9999/12/31 23:59:59";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
			try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setUpdate_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
			}
		}

		/**
		 * setDate
		 * Update_date
		 */

		@Test
		public void testSetUpdate_date1() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate ="1000/01/01 00:00:00";
	         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	         Date dateTest;
	         try {
	 			dateTest = sdFormat.parse(expectedDate);
	 				dto.setUpdate_date(dateTest);
	 		} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
			}
	 	}

		@Test
		public void testSetUpdate_date2() {
			UserInfoDTO dto=new UserInfoDTO();
			 String expectedDate ="9999/12/31 23:59:59";
	        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	        Date dateTest;
	        try {
				dateTest = sdFormat.parse(expectedDate);
					dto.setUpdate_date(dateTest);
			} catch (ParseException e) {
				assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
			}
		}
}
