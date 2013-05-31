package com.praeses.androidstack;

import android.app.Application;

import com.praeses.androidstack.di.AndroidStackModules;

import dagger.ObjectGraph;

public class AndroidStackApplication extends Application {

    private ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();
        graph = ObjectGraph.create(new AndroidStackModules());
    }

    public void inject(Object o) {
        graph.inject(o);
    }
}
