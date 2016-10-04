package com.danny.demo.server.status;

public class ServerBeaconResponse {

    private String status;

    public ServerBeaconResponse() {
    }

    public ServerBeaconResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
