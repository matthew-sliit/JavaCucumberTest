package com.xyz.loginsystem;

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

    public void testLoginWithValidCredentialsLoginUser1Uid358e5357a17e4e1e8f158031d915de1e() {
        loginWithValidCredentials("USER101", "abc9ops_2");
    }

    public void testLoginWithValidCredentialsLoginUser2Uid5411b51f06a1499699533ee4d9173c74() {
        loginWithValidCredentials("USER102", "let012_ks");
    }


    public void accountDisabled(String username, String password) {
        // Tags: Requirement:low
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

    public void testAccountDisabledLoginUser1Uid5476b8b98c614c07b6ed760e00c315d8() {
        accountDisabled("USER100", "s902_p_o12");
    }


    public void loginWithInvalidCredentials(String username, String password) {
        // Given the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
        // When the user enters username and password
        actionwords.theUserEntersUsernameAndPassword();
        // Then the system should verify username and password
        actionwords.theSystemShouldVerifyUsernameAndPassword();
        // Then the system responds with unsuccessful message
        actionwords.theSystemRespondsWithUnsuccessfulMessage();
    }

    public void testLoginWithInvalidCredentialsInvalidUser1Uidd1f8e35339dd46e898936e782636f506() {
        loginWithInvalidCredentials("USER103", "abc9ops_2");
    }
}