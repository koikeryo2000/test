package com.internousdev.kokotown.dto.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.internousdev.kokotown.dto.DestinationDTO;

import junit.framework.TestCase;

public class DestinationDTOTest extends TestCase{
	public DestinationDTOTest(String name){
		super(name);
	}

	public void testGetId() {
		DestinationDTO dto = new DestinationDTO();
		int expected = 0;
		dto.setId(expected);
		assertThat(dto.getId(),is(expected));
	}


	public void testGetId2() {
		DestinationDTO dto = new DestinationDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertThat(dto.getId(),is(expected));
	}


	public void testGetId3() {
		DestinationDTO dto = new DestinationDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertThat(dto.getId(),is(expected));
	}

	public void testGetId4() throws Exception{
		DestinationDTO dto = new DestinationDTO();
		try{
		int expected =Integer.parseInt("-2147483649");
			dto.setId(expected);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),is("For input string: \"-2147483649\""));
		}
	}

	public void testGetId5() throws Exception{
		DestinationDTO dto = new DestinationDTO();
		try{
		int expected =Integer.parseInt("2147483647");
			dto.setId(expected);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),is("For input string: \"2147483647\""));
		}
	}

	public void testSetId() {
		DestinationDTO dto=new DestinationDTO();
		int expected = 0;
		dto.setId(expected);
		int actual=dto.getId();
		assertThat(actual,is(expected));
	}

	public void testSetId2() {
		DestinationDTO dto=new DestinationDTO();
		int expected = 2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertThat(actual,is(expected));
	}

	public void testSetId3() {
		DestinationDTO dto=new DestinationDTO();
		int expected = -2147483648;
		dto.setId(expected);
		int actual=dto.getId();
		assertThat(actual,is(expected));
	}

	public void testSetId4()throws Exception {
		DestinationDTO dto = new DestinationDTO();
		try {
		int expected = Integer.parseInt("-2147483649");
		dto.setId(expected);
		} catch (RuntimeException e) {
			assertThat(e.getMessage(),is("For input string: \"-2147483649\""));
		}
	}

	public void testSetId5()throws Exception {
		DestinationDTO dto = new DestinationDTO();
		try {
		int expected = Integer.parseInt("2147483647");
		dto.setId(expected);
		} catch (RuntimeException e) {
			assertThat(e.getMessage(),is("For input string: \"-2147483649\""));
		}
	}

	public void testGetEmail() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testGetEmail8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setEmail(expected);
		assertThat(dto.getEmail(),is(expected));
	}

	public void testSetEmail() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testSetEmail8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertThat(actual,is(expected));
	}

	public void testGetFamilyName() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testGetFamilyName8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFamilyName(expected);
		assertThat(dto.getFamilyName(),is(expected));
	}

	public void testSetFamilyName() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyName7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}
	public void testSetFamilyName8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertThat(actual,is(expected));
	}


	public void testGetFirstName() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}

	public void testGetFirstName8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFirstName(expected);
		assertThat(dto.getFirstName(),is(expected));
	}


	public void testSetFirstName() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}

	public void testSetFirstName8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertThat(actual,is(expected));
	}



	public void testGetFamilyNameKana() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testGetFamilyNameKana8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFamilyNameKana(expected);
		assertThat(dto.getFamilyNameKana(),is(expected));
	}

	public void testSetFamilyNameKana() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFamilyNameKana8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertThat(actual,is(expected));
	}



	public void testGetFirstNameKana() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testGetFirstNameKana8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFirstNameKana(expected);
		assertThat(dto.getFirstNameKana(),is(expected));
	}

	public void testSetFirstNameKana() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}

	public void testSetFirstNameKana8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertThat(actual,is(expected));
	}


	public void testGetTelNumber() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}

	public void testGetTelNumber8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setTelNumber(expected);
		assertThat(dto.getTelNumber(),is(expected));
	}


	public void testSetTelNumber() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}

	public void testSetTelNumber8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertThat(actual,is(expected));
	}




	public void testGetUserAddress() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}

	public void testGetUserAddress8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setUserAddress(expected);
		assertThat(dto.getUserAddress(),is(expected));
	}


	public void testSetUserAddress() {
		DestinationDTO dto=new DestinationDTO();
		String expected=null;
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress2() {
		DestinationDTO dto=new DestinationDTO();
		String expected="";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress3() {
		DestinationDTO dto=new DestinationDTO();
		String expected=" ";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress4() {
		DestinationDTO dto=new DestinationDTO();
		String expected="　";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress5() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress6() {
		DestinationDTO dto=new DestinationDTO();
		String expected="あいう１２３";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress7() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}

	public void testSetUserAddress8() {
		DestinationDTO dto=new DestinationDTO();
		String expected="abc123あいう１２３漢字";
		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertThat(actual,is(expected));
	}



	public void testGetInsertDate() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate = "1000/01/01 00:00:00";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
		try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setInsertDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
		}
	}

	public void testGetInsertDate2() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate = "9999/12/31 23:59:59";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
		try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setInsertDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
		}
	}

	public void testSetInsertDate() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate ="1000/01/01 00:00:00";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
         try {
 			dateTest = sdFormat.parse(expectedDate);
 				dto.setInsertDate(dateTest);
 		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
		}
 	}


	public void testSetInsertDate2() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate ="9999/12/31 23:59:59";
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date dateTest;
        try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setInsertDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
		}
	}

	public void testGetUpdateDate() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate = "1000/01/01 00:00:00";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
		try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setUpdateDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
		}
	}

	public void testGetUpdateDate2() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate = "9999/12/31 23:59:59";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
		try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setUpdateDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
		}
	}

	public void testSetUpdateDate() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate ="1000/01/01 00:00:00";
         SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
         Date dateTest;
         try {
 			dateTest = sdFormat.parse(expectedDate);
 				dto.setUpdateDate(dateTest);
 		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"1000/01/01 00:00:00\""));
		}
 	}


	public void testSetUpdateDate2() {
		DestinationDTO dto=new DestinationDTO();
		 String expectedDate ="9999/12/31 23:59:59";
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date dateTest;
        try {
			dateTest = sdFormat.parse(expectedDate);
				dto.setUpdateDate(dateTest);
		} catch (ParseException e) {
			assertThat(e.getMessage(),is("For input string: \"9999/12/31 23:59:59\""));
		}
	}

}
