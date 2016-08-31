package com.mpal.rest.response.customer;

import java.util.List;

/**
 * Created by System1 on 8/31/2016.
 */
public class ReqeustListMResponse {
    private List<RequestMResponse> requests;
    private String messageType;
    private String message;

    public List<RequestMResponse> getRequests() {
        return requests;
    }

    public void setRequests(List<RequestMResponse> requests) {
        this.requests = requests;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReqeustListMResponse{" +
                "requests=" + requests +
                ", messageType='" + messageType + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}