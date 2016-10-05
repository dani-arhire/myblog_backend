package com.danny.demo.server.status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;

@Stateless
public class EjbServerBeaconService implements ServerBeaconService {

    private static final Logger logger = LoggerFactory.getLogger(EjbServerBeaconService.class);

    @Override
    public ServerBeaconResponse getServerStatus() {
        logger.info("Retrieving server status");
        return new ServerBeaconResponse("online");
    }
}
