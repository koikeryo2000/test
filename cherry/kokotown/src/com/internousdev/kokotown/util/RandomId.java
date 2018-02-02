package com.internousdev.kokotown.util;

import java.util.UUID;

public class RandomId {

	private String tempUserId;


	/*javaの機能 UUIDを使ってランダムIDを生成し、String型に入れる */
	public RandomId(){
		tempUserId = UUID.randomUUID().toString();
	}

	public String getTempUserId() {
		return tempUserId;
	}

	public void setTempUserId(String tempUserId) {
		this.tempUserId = tempUserId;
	}

}