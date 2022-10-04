package com.apromac.saigneur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
//@EnableDiscoveryClient

@SpringBootApplication
@EnableEurekaClient
public class SaigneurGatewayWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaigneurGatewayWebApplication.class, args);
	}

}
