package com.sammynett.app.dnschanger;

import android.app.Application;

import com.sammynett.app.dnschanger.di.component.ApplicationComponent;
import com.sammynett.app.dnschanger.di.component.DaggerApplicationComponent;
import com.sammynett.app.dnschanger.di.module.ApplicationModule;

import timber.log.Timber;

public class DNSChangerApp extends Application {
    private static ApplicationComponent applicationComponent;

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //di
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();


        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            //TODO: Add your release log tree
        }
    }
}
