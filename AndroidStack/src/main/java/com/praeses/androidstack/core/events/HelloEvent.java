package com.praeses.androidstack.core.events;

import com.praeses.androidstack.core.HelloModel;

public class HelloEvent {

    private final String message;
    private final HelloModel source;

    public HelloEvent(String message, HelloModel source) {
        this.message = message;
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public HelloModel getSource() {
        return source;
    }
}