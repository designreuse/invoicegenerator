package com.anna.webapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		return "login";
	}
	
	
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginfailed(Model model) {
		model.addAttribute("error", "true");
		
		return "login";
	}



}
