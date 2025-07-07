package com.srikanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms03Msc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms03Msc1Application.class, args);
	}

}
