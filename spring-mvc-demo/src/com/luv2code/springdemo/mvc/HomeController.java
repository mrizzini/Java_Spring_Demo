package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		// returns /WEB-INF/view/main-menu.jsp when homepage is hit
		return "main-menu";
	}

}
