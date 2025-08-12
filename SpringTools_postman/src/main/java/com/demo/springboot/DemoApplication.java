package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	//@RequestMapping("api1")
	//public void show() {
		//System.out.println("api caling works in this (example: postman)");
	//}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
