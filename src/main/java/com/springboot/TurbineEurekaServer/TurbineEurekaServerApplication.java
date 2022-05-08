package com.springboot.TurbineEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TurbineEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineEurekaServerApplication.class, args);
	}

}
