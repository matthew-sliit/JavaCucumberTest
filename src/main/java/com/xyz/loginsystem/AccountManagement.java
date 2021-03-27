package com.xyz.loginsystem;

import java.util.HashMap;
import java.util.Map;

public class AccountManagement {
	private class Account{
		public String type = null, pass = null;
		public Account(String type, String password) {
			this.type = type; this.pass = password;
		}
	}
	//store account data
	private static Map<String, Account> accountData;
	private static int instance=0;

	public AccountManagement() {
		if(instance==0) {
			accountData = new HashMap<>();
		}
		instance++;
	}
	private String generateSHA256(String password) {
		return org.apache.commons.codec.digest.DigestUtils.sha256Hex(password);
	}
	public String getType(String username, String password) {
		if(accountData.containsKey(username)) {
			Account account = accountData.get(username);
			if(account.pass.equals(generateSHA256(password))) {
				return account.type;
			}
			return "INVALID-PASSWORD";
		}
		return "INVALID-USERNAME";
	}
	public String createAccount(String type, String username, String password) {
		if(accountData.get(username)!=null) {
			return "ACCOUNT-EXISTS";
		}
		if(type.equals("STUDENT") || type.equals("TEACHER")) {
			accountData.put(username, new Account(type, generateSHA256(password)));
			return "SUCCESS";
		}
		return "INVALID-TYPE";
	}
	public String deleteAccount(String username, String password) {
		if(getType(username, password).startsWith("INVALID-")) {
			return getType(username, password);
		}
		accountData.remove(username);
		return "SUCCESS";
	}
}
