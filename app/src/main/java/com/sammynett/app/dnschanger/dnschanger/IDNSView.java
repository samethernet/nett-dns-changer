package com.sammynett.app.dnschanger.dnschanger;

import com.sammynett.app.dnschanger.model.DNSModel;

public interface IDNSView {
    void changeStatus(int serviceStatus);

    void setServiceInfo(DNSModel model);
}
