package com.qa.app;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.AccountNotFoundException;

public class MapAutoItter {

	public int CountNames(HashMap<String, Account> accountMap, String nameToFind) {
		int counter = 0;
		for (Map.Entry<String, Account> element : accountMap.entrySet()) {
			if(element.getValue().getFirstName().equals(nameToFind))
			{
				counter++;
			}
		}
		return counter;
	}

}
