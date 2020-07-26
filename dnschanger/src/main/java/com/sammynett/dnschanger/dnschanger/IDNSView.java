package com.sammynett.dnschanger.dnschanger;

import com.sammynett.dnschanger.model.DNSModel;

public interface IDNSView {
    void changeStatus(int serviceStatus);

    void setServiceInfo(DNSModel model);
}
