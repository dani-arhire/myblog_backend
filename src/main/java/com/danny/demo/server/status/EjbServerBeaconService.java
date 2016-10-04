package com.danny.demo.server.status;

import javax.ejb.Stateless;

@Stateless
public class EjbServerBeaconService implements ServerBeaconService {

    @Override
    public ServerBeaconResponse getServerStatus() {
        return new ServerBeaconResponse("online");
    }
}
