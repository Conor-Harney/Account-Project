package com.qa.app;

import java.util.Iterator;

import org.json.JSONObject;

public class JsonAutoIterator {

	public int CountNames(String nameToFind, JSONObject jsonMap) {
		int counter = 0;
		Iterator<Account> keys = jsonMap.keys();

		while( keys.hasNext() ) {
		    Account key = (Account)keys.next();
		    if(key.getFirstName() == nameToFind)
		    {
		    	counter++;
		    }
		    //if ( jsonMap.get(key) instanceof JSONObject ) {

		    //}
		}
		return counter;
	}

}
