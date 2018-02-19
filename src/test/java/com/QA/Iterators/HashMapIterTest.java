package com.QA.Iterators;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.qa.app.MapAutoItter;
import com.qa.app.ServiceCalss;

public class HashMapIterTest {
	String nameToFind;
	
	@Before
	public void init()
	{
		nameToFind = "John";
		ServiceCalss.AddAccount("John", "Doe");
		ServiceCalss.AddAccount("jane", "Doe");
		ServiceCalss.AddAccount("John", "Loe");
	}

	@Test
	public void test() {
		assertEquals(2,  MapAutoItter.CountNames(ServiceCalss.getAccountMap(), nameToFind));
	}

}
