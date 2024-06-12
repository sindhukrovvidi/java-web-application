package com.sprinboot.webapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
//	@Autowired
	private AuthenticationService authService;
	
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(authService.authenticate(name, password)) {
			model.put("name", name);
			model.put("name", name);
			return "welcome";
		} else {
			return "login";
		}
		
	}
	
	@RequestMapping("login-params")
	public String login(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("request param is {}", name);
		return "login-params";
	}
}
