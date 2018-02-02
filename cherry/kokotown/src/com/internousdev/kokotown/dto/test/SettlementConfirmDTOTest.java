package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.SettlementConfirmDTO;

public class SettlementConfirmDTOTest {

	/**
	 *
	 *
	 * GetId
	 *
	 *
	 */

	@Test
	public void testGetId1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetId7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetId8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected,actual);
	}

	/**
	 * SetId
	 *
	 */

	@Test
	public void testSetId1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setId(expected);
		String actual=dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();

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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyName8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstName8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();

		assertEquals(expected,actual);
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
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
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual=dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();

		assertEquals(expected,actual);
	}



	/**
	 *
	 *
	 * GetTelNumber
	 *
	 *
	 */

	@Test
	public void testGetTelNumber1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetTelNumber8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected,actual);
	}

	/**
	 * SetTelNumber
	 *
	 */

	@Test
	public void testSetTelNumber1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetTelNumber8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();

		assertEquals(expected,actual);
	}





	/**
	 *
	 *
	 * GetUserAddress
	 *
	 *
	 */

	@Test
	public void testGetUserAddress1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected,actual);
	}

	/**
	 * SetUserAddress
	 *
	 */

	@Test
	public void testSetUserAddress1(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = null;

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress2(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress3(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress4(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected ="　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress5(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress6(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress7(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress8(){
		SettlementConfirmDTO dto = new SettlementConfirmDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();

		assertEquals(expected,actual);
	}




}
