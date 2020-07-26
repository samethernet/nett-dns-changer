package com.sammynett.dnschanger.dns;

import com.sammynett.dnschanger.model.DNSModel;

public interface IDNSView {
    void changeStatus(int serviceStatus);

    void setServiceInfo(DNSModel model);
}
