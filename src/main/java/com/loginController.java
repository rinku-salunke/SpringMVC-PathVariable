package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {


@RequestMapping("/login")
public String getLoginData(@RequestParam("username")String username, @RequestParam("password")String password) {	

	System.out.println(username);
	System.out.println(password);
	
	return "welcome";
}
}
