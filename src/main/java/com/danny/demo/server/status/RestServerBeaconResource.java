package com.danny.demo.server.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("beacon")
public class RestServerBeaconResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("status")
    public Response getServerStatus() {
        return Response
                .status(Response.Status.OK)
                .entity("{\"status\": \"online\"}")
                .build();
    }
}
