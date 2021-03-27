package com.xyz.loginsystem;

import com.xyz.loginsystem.Actionwords;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

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


    //
    // Tags: Requirement:high
    public void testLogoutAfterLoggingInUida3bee92582954722bb12b52f71829c90() {
        // Given the user has logged in
        actionwords.theUserHasLoggedIn();
        // When the user then clicks logout option
        actionwords.theUserThenClicksLogoutOption();
        // Then the system logs user out
        actionwords.theSystemLogsUserOut();
        // And the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
    }
    public void signUpNewAccount(String username, String password, String type) {
        // Given the system shows the sign up option
        actionwords.theSystemShowsTheSignUpOption();
        // When the user enters username and password
        actionwords.theUserEntersUsernameAndPassword();
        // Then the system should verify username and password
        actionwords.theSystemShouldVerifyUsernameAndPassword();
        // But the account exists
        actionwords.theAccountExists();
        // Then the system responds with unsuccessful message
        actionwords.theSystemRespondsWithUnsuccessfulMessage();
    }

    public void testSignUpNewAccountSignUpUser1Uid237899855cb34a75b672153bc009bc1c() {
        signUpNewAccount("USER101", "abc9ops_2", "STUDENT");
    }

    public void testSignUpNewAccountSignUpUser2Uid7066b708a55644019b8a27fde3ce48a7() {
        signUpNewAccount("USER102", "let012_ks", "TEACHER");
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