package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class MapAutoItter {

	public static int CountNames(HashMap<String, Account> MapToItterThrough, String nameToFind) {
		int counter = 0;
		for (Map.Entry<String, Account> element : MapToItterThrough.entrySet()) {
			if(element.getValue().getFirstName().equals(nameToFind))
			{
				counter++;
			}
		}
		return counter;
	}

}
