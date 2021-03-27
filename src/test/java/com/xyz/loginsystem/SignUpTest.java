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

    public void testSignUpNewAccountSignUpUser1Uid40c464cce400461b97208c0b616f2961() {
        signUpNewAccount("USER101", "abc9ops_2", "STUDENT");
    }

    public void testSignUpNewAccountSignUpUser2Uid60c074325bd3406c8d4c37b2c9dd478c() {
        signUpNewAccount("USER102", "let012_ks", "TEACHER");
    }
}