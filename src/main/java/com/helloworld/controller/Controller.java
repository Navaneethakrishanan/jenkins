package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
	@GetMapping (value="/gethelloworld")
	public String gethelloworld() {
		return "hi";
	}

}
