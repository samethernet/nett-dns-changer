package com.sammynett.app.dnschanger.dnschanger;

import com.sammynett.app.dnschanger.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DNSModule {

    private IDNSView idnsView;

    public DNSModule(IDNSView idnsView) {
        this.idnsView = idnsView;
    }

    @Provides
    @ActivityScope
    IDNSView idnsView() {
        return idnsView;
    }

}
