package com.praeses.androidstack.di;

import com.praeses.androidstack.MainActivity;

import dagger.Module;

@Module(
        includes = {
                HelloModule.class,
                EventBusModule.class
        },
        injects = {
                MainActivity.class
        }
)

public class AndroidStackModules {}