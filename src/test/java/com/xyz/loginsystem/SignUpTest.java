package com.xyz.loginsystem;

import junit.framework.TestCase;

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

    public void testSignUpNewAccountSignUpUser1Uideb7139b75ebd490fb901778598e47a93() {
        signUpNewAccount("USER101", "abc9ops_2", "STUDENT");
    }

    public void testSignUpNewAccountSignUpUser2Uid7da387039b714e67ac4225cc8383562b() {
        signUpNewAccount("USER102", "let012_ks", "TEACHER");
    }
}