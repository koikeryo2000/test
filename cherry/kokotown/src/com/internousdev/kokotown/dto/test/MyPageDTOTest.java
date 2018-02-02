package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.MyPageDTO;

public class MyPageDTOTest {

	/**
	 * getString用テンプレート
	 *
	 * FamilyName
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetFamilyName1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFamilyName(expected);
	String actual=dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyName8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetFamilyName1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFamilyName(expected);
	String actual=dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();

	assertEquals(expected,actual);
	}

	/**
	 * getString用テンプレート
	 *
	 * FirstName
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetFirstName1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFirstName(expected);
	String actual=dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstName8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetFirstName1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFirstName(expected);
	String actual=dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();

	assertEquals(expected,actual);
	}

	/**
	 * getString用テンプレート
	 *
	 * FamilyNameKana
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetFamilyNameKana1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFamilyNameKana(expected);
	String actual=dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetFamilyNameKana1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFamilyNameKana(expected);
	String actual=dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFamilyNameKana(expected);
	String actual = dto.getFamilyNameKana();

	assertEquals(expected,actual);
	}

	/**
	 * getString用テンプレート
	 *
	 * FirstNameKana
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetFirstNameKana1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFirstNameKana(expected);
	String actual=dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetFirstNameKana1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setFirstNameKana(expected);
	String actual=dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFirstNameKana(expected);
	String actual = dto.getFirstNameKana();

	assertEquals(expected,actual);
	}

	/**
	 * getString用テンプレート
	 *
	 * Sex
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetSex1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setSex(expected);
	String actual=dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetSex7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetSex8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetSex1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setSex(expected);
	String actual=dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetSex7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetSex8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setSex(expected);
	String actual = dto.getSex();

	assertEquals(expected,actual);
	}

	/**
	 * getString用テンプレート
	 *
	 * Email
	 * MyPageDTO
	 *
	 */

	@Test
	public void testGetEmail1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setEmail(expected);
	String actual=dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected,actual);
	}

	/**
	 * setString用テンプレート
	 *
	 */

	@Test
	public void testSetEmail1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ";

	dto.setEmail(expected);
	String actual=dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4(){
	MyPageDTO dto = new MyPageDTO();
	String expected ="　";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいう１２３";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setEmail(expected);
	String actual = dto.getEmail();

	assertEquals(expected,actual);
	}
}
