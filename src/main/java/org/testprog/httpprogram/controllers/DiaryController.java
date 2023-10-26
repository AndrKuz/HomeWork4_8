package org.testprog.httpprogram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiaryController {

	@GetMapping("/diary")
	public String diaryPage(@RequestParam(value = "name", required = false) String name,
							@RequestParam(value = "middlename", required = false) String middlename,
			                @RequestParam(value = "surname", required = false) String surname,
			                Model model) {

		if (name != null && middlename != null && surname != null) {
		    model.addAttribute("message", "Hello " + name + " " + middlename + " " + surname + ", my name is Tom Riddle");
		} else {
			model.addAttribute("message", "Hello " + ", my name is Tom Riddle");
		}
		return "diary/hello";
	}
	
}
