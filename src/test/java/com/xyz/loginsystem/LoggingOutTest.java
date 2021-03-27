package com.xyz.loginsystem;

import junit.framework.TestCase;
import com.xyz.loginsystem.Actionwords;

public class LoggingOutTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
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
}