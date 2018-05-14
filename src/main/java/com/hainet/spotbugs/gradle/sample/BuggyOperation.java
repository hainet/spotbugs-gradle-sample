package com.hainet.spotbugs.gradle.sample;

public class BuggyOperation {

    public void run() {
        final String value = null;
        value.toString();
    }
}
