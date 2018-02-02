package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.LoginDTO;

public class LoginDTOTest {





	 //メールアドレス
	/**
     * {@link com.internousdev.kokotown.dto.LoginDTO#getEmail()} のためのテスト・メソッド。
     */

	@Test
	public void testGetEmail1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testGetEmail3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

		/**
	     * {@link com.internousdev.kokotown.dto.LoginDTO#SetUserIdError()} のためのテスト・メソッド。
	     */


	@Test
	public void testSetEmail1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testSetEmail3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}



	//パスワード
		/**
	     * {@link com.internousdev.kokotown.dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	     */
	@Test
	public void testGetPassword1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testGetPassword3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	/**
     * {@link com.internousdev.kokotown.dto.LoginDTO#setPassword()} のためのテスト・メソッド。
     */


	@Test
	public void testSetPassword1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testSetPassword3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	 //ログインフラグ
	@Test
    public void testIsLoginFlg() {
        LoginDTO test = new LoginDTO();
        boolean expected = true;
        test.setLoginFlg(expected);
        boolean actual = test.getLoginFlg();
        assertEquals(expected, actual);
    }
	@Test
    public void testIsLoginFlg2() {
        LoginDTO test = new LoginDTO();
        boolean expected = false;
        test.setLoginFlg(expected);
        boolean actual = test.getLoginFlg();
        assertEquals(expected, actual);
    }
	@Test
    public void testSetLoginFlg() {
        LoginDTO test = new LoginDTO();
        boolean expected = true;
        test.setLoginFlg(expected);
        boolean actual = test.getLoginFlg();
        assertEquals(expected, actual);
    }

	@Test
    public void testSetLoginFlg2() {
        LoginDTO test = new LoginDTO();
        boolean expected = false;
        test.setLoginFlg(expected);
        boolean actual = test.getLoginFlg();
        assertEquals(expected, actual);
	}




	/**
    * {@link com.internousdev.kokotown.dto.LoginDTO#getUserIdError()} のためのテスト・メソッド。
    */

	@Test
	public void testGetUserIdError1() {
		LoginDTO dto= new LoginDTO();
       String expected=null;

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError2() {
		LoginDTO dto= new LoginDTO();
       String expected="";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}


	@Test
	public void testGetUserIdError3() {
		LoginDTO dto= new LoginDTO();
       String expected=" ";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError4() {
		LoginDTO dto= new LoginDTO();
       String expected="　";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError5() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError6() {
		LoginDTO dto= new LoginDTO();
       String expected="あいう１２３";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError7() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123あいう１２３";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdError8() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123あいう１２３漢字";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

		/**
	     * {@link com.internousdev.kokotown.dto.LoginDTO#SetUserIdError()} のためのテスト・メソッド。
	     */


	@Test
	public void testSetUserIdError1() {
		LoginDTO dto= new LoginDTO();
       String expected=null;

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError2() {
		LoginDTO dto= new LoginDTO();
       String expected="";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}


	@Test
	public void testSetUserIdError3() {
		LoginDTO dto= new LoginDTO();
       String expected=" ";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError4() {
		LoginDTO dto= new LoginDTO();
       String expected="　";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError5() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError6() {
		LoginDTO dto= new LoginDTO();
       String expected="あいう１２３";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError7() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123あいう１２３";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdError8() {
		LoginDTO dto= new LoginDTO();
       String expected="abc123あいう１２３漢字";

       dto.setEmail(expected);
       String actual=dto.getEmail();

       assertEquals(expected,actual);
	}


	/**
     * {@link com.internousdev.kokotown.dto.LoginDTO#GetPasswordError()} のためのテスト・メソッド。
     */


	@Test
	public void testGetPasswordError1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testGetPasswordError3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testGetPasswordError8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

		/**
	     * {@link com.internousdev.kokotown.dto.LoginDTO#SetPasswordError()} のためのテスト・メソッド。
	     */


	@Test
	public void testSetPasswordError1() {
		LoginDTO dto= new LoginDTO();
        String expected=null;

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError2() {
		LoginDTO dto= new LoginDTO();
        String expected="";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}


	@Test
	public void testSetPasswordError3() {
		LoginDTO dto= new LoginDTO();
        String expected=" ";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError4() {
		LoginDTO dto= new LoginDTO();
        String expected="　";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError5() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError6() {
		LoginDTO dto= new LoginDTO();
        String expected="あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError7() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}

	@Test
	public void testSetPasswordError8() {
		LoginDTO dto= new LoginDTO();
        String expected="abc123あいう１２３漢字";

        dto.setEmail(expected);
        String actual=dto.getEmail();

        assertEquals(expected,actual);
	}






}
