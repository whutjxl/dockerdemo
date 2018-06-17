package com.whutjxl.docker.demo.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DockerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}
}
