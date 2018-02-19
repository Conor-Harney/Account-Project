package com.QA.Iterators;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.MapAutoItter;
import com.qa.app.ServiceCalss;

public class HashMapIterTest {

	@Test
	public void test() {
		MapAutoItter myMapSearcher = new MapAutoItter();
		String nameToFind = "John";
		
		ServiceCalss.AddAccount("John", "Doe");
		ServiceCalss.AddAccount("jane", "Doe");
		ServiceCalss.AddAccount("John", "Loe");
		
		int counter = myMapSearcher.CountNames(ServiceCalss.getAccountMap(), nameToFind);
		
		assertEquals(2, counter);
	}

}
