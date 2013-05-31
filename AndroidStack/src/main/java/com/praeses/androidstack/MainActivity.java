package com.praeses.androidstack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.praeses.androidstack.core.HelloModel;
import com.praeses.androidstack.core.events.HelloEvent;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject HelloModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.greetingButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.sayHello();
            }
        });
    }

    @Subscribe
    public void onEvent(HelloEvent event) {
        ((TextView)findViewById(R.id.helloMessage)).setText(event.getMessage());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}