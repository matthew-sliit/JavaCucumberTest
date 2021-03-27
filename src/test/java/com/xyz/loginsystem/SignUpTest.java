package com.xyz.loginsystem;

import junit.framework.TestCase;
import com.xyz.loginsystem.Actionwords;

public class SignUpTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
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
}