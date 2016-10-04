package com.danny.demo.server.status;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ServerBeaconServiceTest {

    private ServerBeaconService serverBeaconService = new EjbServerBeaconService();

    @Test
    public void shouldBeServerStatusOnline() {
        ServerBeaconResponse response = serverBeaconService.getServerStatus();
        assertThat(response).isNotNull();
        assertThat(response.getStatus()).isEqualTo("online");
    }
}
