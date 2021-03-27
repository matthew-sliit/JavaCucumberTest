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

    public void testLoginWithValidCredentialsLoginUser1Uid6ebd46520a9f49e889da0966ecab6994() {
        loginWithValidCredentials("USER101", "abc9ops_2");
    }

    public void testLoginWithValidCredentialsLoginUser2Uid99037f88a12e419aaa9fafe5ea7441d7() {
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

    public void testAccountDisabledLoginUser1Uid6307f6993a114b9cb18c9603228a2c0f() {
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

    public void testLoginWithInvalidCredentialsInvalidUser1Uidd7cf453f485442fdb75b0887ba82296a() {
        loginWithInvalidCredentials("USER103", "abc9ops_2");
    }
}