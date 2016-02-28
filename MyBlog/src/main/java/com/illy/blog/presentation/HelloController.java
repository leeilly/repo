package com.illy.blog.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(method=RequestMethod.GET, value={"/","/hello"})
	public String main(HttpServletRequest request, HttpServletResponse response, Model model){
		model.addAttribute("name", "illy");
		return "/illy/blog/main/hello";
		
	}
}
