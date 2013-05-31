package com.praeses.androidstack.core;

import com.praeses.androidstack.core.events.HelloEvent;
import com.squareup.otto.Bus;

import javax.inject.Inject;

public class FrenchHelloModel implements HelloModel {
    private final Bus bus;

    @Inject
    public FrenchHelloModel(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void sayHello() {
        bus.post(new HelloEvent("Bonjour. Comment ca va?", this));
    }
}