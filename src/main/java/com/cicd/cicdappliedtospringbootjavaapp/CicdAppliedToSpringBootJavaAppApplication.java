package com.cicd.cicdappliedtospringbootjavaapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {

	@GetMapping("/")
	public String home() {
		return "Hello World from Deez house";
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
		
		 Network net = new Network(4,1,3,4);
		 double[] output = net.calculate(0.2, 0.9, 0.3, 0.4);
		 System.out.println(Arrays.toString(output));
	}

}
