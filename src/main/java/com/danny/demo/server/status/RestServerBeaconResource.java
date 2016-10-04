package com.danny.demo.server.status;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("beacon")
public class RestServerBeaconResource {

    @Inject
    private ServerBeaconService serverBeaconService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("status")
    public ServerBeaconResponse getServerStatus() {
        return serverBeaconService.getServerStatus();
    }
}
