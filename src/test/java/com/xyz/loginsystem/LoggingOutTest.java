package com.xyz.loginsystem;

import junit.framework.TestCase;

public class LoggingOutTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    //
    // Tags: Requirement:high
    public void testLogoutAfterLoggingInUid717250f86bd348cbb710b00f1a055e23() {
        // Given the user has logged in
        actionwords.theUserHasLoggedIn();
        // When the user then clicks logout option
        actionwords.theUserThenClicksLogoutOption();
        // Then the system logs user out
        actionwords.theSystemLogsUserOut();
        // And the system shows the login option
        actionwords.theSystemShowsTheLoginOption();
    }
}