package com.judas.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloApplication {

	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "The weather would be quite nice were it not snowing in the springtime!"; //printed on homepage of application
	}

	//This application has been made to refresh each time the server is ran
	//It displays a message using Spring

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
