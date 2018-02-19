package com.QA.Iterators;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.ServiceCalss;

public class JsonIterationTests {

	@Test
	public void test() {
		JsonAutoIterator jsonIterator = new JsonAutoIterator();
		String nameToFind = "john";

		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum2 = ServiceCalss.AddAccount("Jane", "Doe");
		Account AccAtZero = null;
		
		JSONObject jsonMap = ServiceCalss.getJsonMap();
		
		
		
		assertEquals(3, jsonIterator.CountNames(nameToFind, jsonMap));
		
	}

}
