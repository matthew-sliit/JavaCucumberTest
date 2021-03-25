package com.xyz.LoginSystem;

import junit.framework.TestCase;

public class LoggingInTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    public void loginWithValidCredentials(String username, String password) {
        // Tags: Requirement:high
        // Given the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
        // When the user enters username and password
        actionwords.theUserEntersUsernameAndPassword();
        // Then the system should verify username and password
        actionwords.theSystemShouldVerifyUsernameAndPassword();
        // And the system responds with successful message
        actionwords.theSystemRespondsWithSuccessfulMessage();
    }

    public void testLoginWithValidCredentialsLoginUser1() {
        loginWithValidCredentials("USER101", "abc9ops_2");
    }

    public void testLoginWithValidCredentialsLoginUser2() {
        loginWithValidCredentials("USER102", "let012_ks");
    }


    //
    // Tags: Requirement:low
    public void testAccountDisabled() {
    	fail("No Account Found");
        // Given the account is disabled
        actionwords.theAccountIsDisabled();
        // And the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
        // When the user enters username and password
        actionwords.theUserEntersUsernameAndPassword();
        // Then the system should verify username and password
        actionwords.theSystemShouldVerifyUsernameAndPassword();
        // And the system responds with login error account disabled message
        actionwords.theSystemRespondsWithLoginErrorAccountDisabledMessage();
    }

    public void testLoginWithInvalidCredentials() {
        // Given the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
        // When the user enters username and password
        actionwords.theUserEntersUsernameAndPassword();
        // Then the system should verify username and password
        actionwords.theSystemShouldVerifyUsernameAndPassword();
        // Then the system responds with unsuccessful message
        actionwords.theSystemRespondsWithUnsuccessfulMessage();
    }
}