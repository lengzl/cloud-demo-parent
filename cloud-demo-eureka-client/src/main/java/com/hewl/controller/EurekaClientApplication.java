package com.hewl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	SpringApplication.run(EurekaClientApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    
    @GetMapping("/test")
    public String testMethod(@RequestParam("name") String name) {
		return "Hello World! 端口为:" + port + "名字为:" + name;
	}
}
