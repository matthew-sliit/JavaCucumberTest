package com.xyz.loginsystem;

import junit.framework.TestCase;
import com.xyz.loginsystem.Actionwords;

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

    public void testLoginWithValidCredentialsLoginUser1Uid479360b47cc447a6aebfb7cb2d55fce2() {
        loginWithValidCredentials("USER101", "abc9ops_2");
    }

    public void testLoginWithValidCredentialsLoginUser2Uid1c7bc21a0987406dbfb8a650b235cb5d() {
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

    public void testAccountDisabledLoginUser1Uid55467d15c44244afa00142395def1abd() {
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

    public void testLoginWithInvalidCredentialsInvalidUser1Uid301b8f82ea644dc088521e06cb00cab1() {
        loginWithInvalidCredentials("USER103", "abc9ops_2");
    }
}