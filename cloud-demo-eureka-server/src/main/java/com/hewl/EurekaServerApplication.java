package com.hewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * 只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	SpringApplication.run(EurekaServerApplication.class, args);
    }
}
