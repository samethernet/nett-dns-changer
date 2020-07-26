package com.sammynett.dnschanger.dnschanger;

import com.sammynett.dnschanger.di.scope.ActivityScope;

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
