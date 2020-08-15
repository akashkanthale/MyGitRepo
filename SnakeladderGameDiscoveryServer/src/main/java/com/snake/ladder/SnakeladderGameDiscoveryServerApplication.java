package com.snake.ladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SnakeladderGameDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnakeladderGameDiscoveryServerApplication.class, args);
	}

}
