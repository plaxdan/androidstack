package com.praeses.androidstack;

import android.app.Activity;
import android.os.Bundle;

import com.squareup.otto.Bus;

import javax.inject.Inject;

public class BaseActivity extends Activity {

    @Inject Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AndroidStackApplication) getApplication()).inject(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        bus.unregister(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        bus.register(this);
    }
}
