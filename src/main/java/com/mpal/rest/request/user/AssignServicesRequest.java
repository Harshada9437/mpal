package com.mpal.rest.request.user;

import java.util.List;

/**
 * Created by System1 on 8/22/2016.
 */
public class AssignServicesRequest {

    private List<ServiceInfo> serviceInfoList;

    public List<ServiceInfo> getServiceInfoList() {
        return serviceInfoList;
    }

    public void setServiceInfoList(List<ServiceInfo> serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
    }

    @Override
    public String toString() {
        return "AssignServicesRequest{" +
                "serviceInfoList=" + serviceInfoList +
                '}';
    }
}
