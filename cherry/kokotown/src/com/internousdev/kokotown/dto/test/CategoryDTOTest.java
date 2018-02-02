package com.internousdev.kokotown.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kokotown.dto.CategoryDTO;

public class CategoryDTOTest {

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

	@Test
	public void testGetCategoryId_id1() {
		CategoryDTO dto = new CategoryDTO();
		int test = 0;
		dto.setCategoryId(test);
		assertEquals(test, dto.getCategoryId());
	}
	@Test
	public void testGetCategoryId_id2() {
		CategoryDTO dto = new CategoryDTO();
		int test = 2147483647;

		dto.setCategoryId(test);
		assertEquals(test, dto.getCategoryId());
	}
	@Test
	public void testGetCategoryId_id3() {
		CategoryDTO dto = new CategoryDTO();
		int test = -2147483647;
		dto.setCategoryId(test);
		assertEquals(test, dto.getCategoryId());
	}
	@Test
	public void testGetCategoryId_id4() {
		CategoryDTO dto = new CategoryDTO();
		try{
			int test = Integer.parseInt("2147483649");
			dto.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"2147483649\"");
		}
	}
	@Test
	public void testGetCategoryId_id5() {
		CategoryDTO dto = new CategoryDTO();
		try{
			int test = Integer.parseInt("-2147483649");
			dto.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetCategoryId_id1() {
		CategoryDTO dto = new CategoryDTO();
		int test = 0;
		dto.setCategoryId(test);
		int result = dto.getCategoryId();
		assertEquals(test, result);
	}
	@Test
	public void testSetCategoryId_id2() {
		CategoryDTO dto = new CategoryDTO();
		int test = 2147483647;
		dto.setCategoryId(test);
		int result = dto.getCategoryId();
		assertEquals(test, result);
	}
	@Test
	public void testSetCategoryId_id3() {
		CategoryDTO dto = new CategoryDTO();
		int test = -2147483647;
		dto.setCategoryId(test);
		int result = dto.getCategoryId();
		assertEquals(test, result);
	}
	@Test
	public void testSetCategoryId_id4() {
		CategoryDTO dto = new CategoryDTO();
		try{
			int test = Integer.parseInt("2147483647");
			dto.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	@Test
	public void testSetCategoryId_id5() {
		CategoryDTO dto = new CategoryDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			dto.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetCategoryName1() {
		CategoryDTO dto = new CategoryDTO();
		String test = null;
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName2() {
		CategoryDTO dto = new CategoryDTO();
		String test = "";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName3() {
		CategoryDTO dto = new CategoryDTO();
		String test = " ";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName4() {
		CategoryDTO dto = new CategoryDTO();
		String test = "　";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName5() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}
	@Test
	public void testGetCategoryName6() {
		CategoryDTO dto = new CategoryDTO();
		String test = "あいう１２３";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName7() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName8() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３漢字";
		dto.setCategoryName(test);
		assertEquals(test, dto.getCategoryName());
	}

	@Test
	public void testSetCategoryName1() {
		CategoryDTO dto = new CategoryDTO();
		String test = null;
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName2() {
		CategoryDTO dto = new CategoryDTO();
		String test = "";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName3() {
		CategoryDTO dto = new CategoryDTO();
		String test = " ";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName4() {
		CategoryDTO dto = new CategoryDTO();
		String test = "　";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName5() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName6() {
		CategoryDTO dto = new CategoryDTO();
		String test = "あいう１２３";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName7() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryName8() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３漢字";
		dto.setCategoryName(test);
		String result = dto.getCategoryName();
		assertEquals(test, result);
	}

	@Test
	public void testGetCategoryDescription1() {
		CategoryDTO dto = new CategoryDTO();
		String test = null;
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String test = "";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String test = " ";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String test = "　";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String test = "あいう１２３";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription8() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３漢字";
		dto.setCategoryDescription(test);
		assertEquals(test, dto.getCategoryDescription());
	}

	@Test
	public void testSetCategoryDescription1() {
		CategoryDTO dto = new CategoryDTO();
		String test = null;
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String test = "";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String test = " ";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String test = "　";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String test = "あいう１２３";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryDescription8() {
		CategoryDTO dto = new CategoryDTO();
		String test = "abc123あいう１２３漢字";
		dto.setCategoryDescription(test);
		String result = dto.getCategoryDescription();
		assertEquals(test, result);
	}


}
