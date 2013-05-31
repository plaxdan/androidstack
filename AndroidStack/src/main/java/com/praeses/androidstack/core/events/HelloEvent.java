package com.praeses.androidstack.core.events;

public class HelloEvent {

    private final String message;

    public HelloEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}