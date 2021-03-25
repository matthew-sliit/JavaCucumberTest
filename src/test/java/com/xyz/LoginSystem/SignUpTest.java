package com.xyz.LoginSystem;

import junit.framework.TestCase;

public class SignUpTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSignUpNewAccount() {
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
}