package com.klonoadesign.starwarswiki.usecase.mainscreen.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainScreenController {

	@GetMapping("/")
	public String mainScreen() {
		return "index";
	}
	
}
