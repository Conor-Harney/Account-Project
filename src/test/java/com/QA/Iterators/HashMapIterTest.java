package com.QA.Iterators;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.ServiceCalss;

public class HashMapIterTest {

	@Test
	public void test() {
		MapAutoItter myMapSearcher = new MapAutoItter();
		String nameToFind = "John";
		
		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum1 = ServiceCalss.AddAccount("John", "Doe");;
		int accTrackingNum2 = ServiceCalss.AddAccount("John", "Loe");
		
		int counter = myMapSearcher.CountNames(getAccountMap, ServiceCalss.getAccountMap());
		
		assertEquals(2, counter);
	}

}
