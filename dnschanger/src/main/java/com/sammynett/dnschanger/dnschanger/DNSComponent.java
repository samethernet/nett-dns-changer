package com.sammynett.dnschanger.dnschanger;

import com.sammynett.dnschanger.di.component.ApplicationComponent;
import com.sammynett.dnschanger.di.scope.ActivityScope;

import dagger.Component;

@Component(modules = {DNSModule.class}, dependencies = {ApplicationComponent.class})
@ActivityScope
public interface DNSComponent {

    IDNSView view();

    void inject(MainActivity activity);
}
