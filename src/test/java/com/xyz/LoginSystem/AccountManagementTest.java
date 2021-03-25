package com.xyz.LoginSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//@RunWith(Cucumber.class) //not required for junit 5
/*@CucumberOptions(
 features = "Feature"
 ,glue={"stepDefinition"}
 )*/
class AccountManagementTest {
	@Test
	void testAccountCreation() {
		String username = "JohnFeatherington", password = "+n02PKs_hecto";
		AccountManagement accountManager = new AccountManagement();
		//create new account using username and password
		accountManager.createAccount("STUDENT", username, password);
		//check is account exists
		assertEquals("STUDENT",accountManager.getType(username, password));
		//if account exists, another account with same username shouldn't be created
		assertNotEquals("SUCCESS", accountManager.createAccount("STUDENT", username, password));
		//account data is set to a static variable, hence it should be saved event during the next time the class is initiated
		accountManager = new AccountManagement();
		assertNotEquals("SUCCESS", accountManager.createAccount("STUDENT", username, password));
		//ensure the delete was successful
		assertEquals("SUCCESS",accountManager.deleteAccount(username, password));
		
	}
	
	@Test
	void testAccountTypes() {
		String username = "JohnFeatherington", password = "+n02PKs_hecto";
		AccountManagement accountManager = new AccountManagement();
		//only types student and teacher exists, other types should be invalid
		assertEquals("INVALID-TYPE", accountManager.createAccount("LECTURER", username, password));
	}
	
}
