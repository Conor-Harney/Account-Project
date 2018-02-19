package com.qa.app;

import java.util.HashMap;

import org.json.JSONObject;

public class ServiceCalss {
	private static int accountNumCountr = 0;
	private static HashMap<String, Account> m_accountMap = new HashMap<String, Account>();
	
	public static int AddAccount(String firstName, String secondName)
	{
		m_accountMap.put(Integer.toString(accountNumCountr), new Account(firstName, secondName, accountNumCountr));
		accountNumCountr++;
		return (accountNumCountr - 1);
	}
	
	public static Account getAccount(int key)
	{
		return m_accountMap.get(key);
	}
	
	public static HashMap<String, Account> getAccountMap() {
		return m_accountMap;
	}


	public static int getNextAccNumber()
	{
		return accountNumCountr;
	}
	
	public static JSONObject getJsonMap()
	{
		return new JSONObject(m_accountMap);
	}

}
