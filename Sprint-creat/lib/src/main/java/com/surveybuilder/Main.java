package com.surveybuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class Main {

	public static void main(String[] args) {
		
		SpringApplication.run(Main.class,args);
		

	}

}
//http:localhost:9090/admin-api/swagger-ui/