package com.example.Task1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("printName/{name}")
	public String printName(@PathVariable (value="name") String name) {
		return "Name :"+ name;
	}
	
}
