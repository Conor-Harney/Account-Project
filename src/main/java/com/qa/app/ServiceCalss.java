package com.qa.app;

import java.util.HashMap;

public class ServiceCalss {
	private static int accountNumCountr = 0;
	private static HashMap<Integer, Account> m_accountMap = new HashMap<Integer, Account>();
	
	public static int AddAccount(String firstName, String secondName)
	{
		m_accountMap.put(accountNumCountr, new Account(firstName, secondName, accountNumCountr));
		accountNumCountr++;
		return (accountNumCountr - 1);
	}
	
	public static Account getAccount(int key)
	{
		return m_accountMap.get(key);
	}
	
	public static int getNextAccNumber()
	{
		return accountNumCountr;
	}

}
