package com.praeses.androidstack.core;

import com.praeses.androidstack.core.events.HelloEvent;
import com.squareup.otto.Bus;

import javax.inject.Inject;

public class EnglishHelloModel implements HelloModel {

    private final Bus bus;

    @Inject
    public EnglishHelloModel(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void sayHello() {
        bus.post(new HelloEvent("Hello, how are you?"));
    }
}
