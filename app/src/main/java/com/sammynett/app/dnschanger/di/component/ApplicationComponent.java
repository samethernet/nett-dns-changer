package com.sammynett.app.dnschanger.di.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.sammynett.app.dnschanger.DNSChangerApp;
import com.sammynett.app.dnschanger.di.module.ApplicationModule;
import com.sammynett.app.dnschanger.dnschanger.DNSService;
import com.sammynett.app.dnschanger.utils.RxBus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    DNSChangerApp dnsChangerApp();

    RxBus rxBus();

    Context appContext();

    SharedPreferences pref();

    Gson gson();

    void inject(DNSService service);

}
