package com.example.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class inventrorycontroller {
	@GetMapping("/inventory")
	public String name() {
		return "INVNETORY OPENED SUCCESSFULLY";
				
	}

}
