package haha.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Web store!");
		model.addAttribute("tagline", "The first one to serve Rwanda");
		
		return "welcome";
	}

}
