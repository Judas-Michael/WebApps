package com.judas.hellotemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class HellotemplatesApplication {

	@RequestMapping("/")
	public String home(Model model){
	    model.addAttribute("author", "Judas");
	    List favouriteFoods = Arrays.asList("sushi","mashed potatoes","miso soup","fudge");
	    model.addAttribute("favourite_food",favouriteFoods);
	    model.addAttribute("favourite_movie","Interview With the Vampire");
		return "index.html";
	}


	public static void main(String[] args) {
		SpringApplication.run(HellotemplatesApplication.class, args);
	}
}
