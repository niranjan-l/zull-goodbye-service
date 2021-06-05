package com.niranjan2021.zullgoodbyeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulGoodbyeServiceApplication {




	public static void main(String[] args) {

		SpringApplication.run(ZuulGoodbyeServiceApplication.class, args);
	}

}
