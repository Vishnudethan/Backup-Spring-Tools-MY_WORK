package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FrameWorkFeApplication {
	//@RequestMapping("/api1")
//	public String show() {
		//System.out.println("<h1>this thing works</h1>");
	//	System.out.println("wow this works");
		//return "<h1>this thing works</h1>";
	//}

	public static void main(String[] args) {
		SpringApplication.run(FrameWorkFeApplication.class, args);
	}

}
