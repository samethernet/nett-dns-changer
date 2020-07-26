package com.sammynett.dnschanger.di.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.sammynett.dnschanger.DNSChangerApp;
import com.sammynett.dnschanger.di.module.ApplicationModule;
import com.sammynett.dnschanger.dnschanger.DNSService;
import com.sammynett.dnschanger.utils.RxBus;

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
