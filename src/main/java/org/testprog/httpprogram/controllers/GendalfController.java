package org.testprog.httpprogram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GendalfController {
	
	@GetMapping("/ysnp")
	public String ysnp() {
		return "genfalf/ysnp";
	}

}
