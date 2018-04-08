package com.demo.graduationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GraduationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraduationServerApplication.class, args);
	}
}
