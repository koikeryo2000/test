package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.ResetUserPassDTO;

public class ResetUserPassDTOTest {

	/**
	 *
	 *
	 * GetLoginId
	 *
	 *
	 */

	@Test
	public void testGetLoginId1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetLoginId7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetLoginId8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected,actual);
	}

	/**
	 * SetLoginId
	 *
	 */

	@Test
	public void testSetLoginId1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setLoginId(expected);
		String actual=dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetLoginId7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetLoginId8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setLoginId(expected);
		String actual = dto.getLoginId();

		assertEquals(expected,actual);
	}



	/**
	 *
	 *
	 * GetNewPassword
	 *
	 *
	 */

	@Test
	public void testGetNewPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual=dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetNewPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected,actual);
	}

	/**
	 * SetNewPassword
	 *
	 */

	@Test
	public void testSetNewPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setNewPassword(expected);
		String actual=dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetNewPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();

		assertEquals(expected,actual);
	}


	/**
	 *
	 *
	 * GetConfirmPassword
	 *
	 *
	 */

	@Test
	public void testGetConfirmPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setConfirmPassword(expected);
		String actual=dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetConfirmPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetConfirmPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected,actual);
	}

	/**
	 * SetConfirmPassword
	 *
	 */

	@Test
	public void testSetConfirmPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setConfirmPassword(expected);
		String actual=dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetConfirmPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetConfirmPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setConfirmPassword(expected);
		String actual = dto.getConfirmPassword();

		assertEquals(expected,actual);
	}




	/**
	 *
	 *
	 * GetHideEmail
	 *
	 *
	 */

	@Test
	public void testGetHideEmail1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setHideEmail(expected);
		String actual=dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideEmail7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetHideEmail8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected,actual);
	}

	/**
	 * SetHideEmail
	 *
	 */

	@Test
	public void testSetHideEmail1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setHideEmail(expected);
		String actual=dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideEmail7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetHideEmail8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideEmail(expected);
		String actual = dto.getHideEmail();

		assertEquals(expected,actual);
	}


	/**
	 *
	 *
	 * GetHideNewLoginPassword
	 *
	 *
	 */

	@Test
	public void testGetHideNewLoginPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setHideNewLoginPassword(expected);
		String actual=dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetHideNewLoginPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetHideNewLoginPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected,actual);
	}

	/**
	 * SetHideNewLoginPassword
	 *
	 */

	@Test
	public void testSetHideNewLoginPassword1(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = null;

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword2(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword3(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = " ";

		dto.setHideNewLoginPassword(expected);
		String actual=dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword4(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected ="　";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword5(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword6(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetHideNewLoginPassword7(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetHideNewLoginPassword8(){
		ResetUserPassDTO dto = new ResetUserPassDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHideNewLoginPassword(expected);
		String actual = dto.getHideNewLoginPassword();

		assertEquals(expected,actual);
	}




}
