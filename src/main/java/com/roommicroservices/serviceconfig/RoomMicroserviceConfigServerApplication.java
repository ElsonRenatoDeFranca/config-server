package com.roommicroservices.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RoomMicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceConfigServerApplication.class, args);
	}

}
