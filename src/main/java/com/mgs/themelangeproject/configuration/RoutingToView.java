package com.mgs.themelangeproject.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingToView {
	
	
	@RequestMapping("/")
	public String routing(){
		
		return "index";
	}

	@RequestMapping("/home")
	public String index(){
		
		return "navigate";
	}
}
