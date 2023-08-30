package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Dev {
	@GetMapping(value="hi")
	public String hi() {
		return "Welcome the jenkins";
	}

}
