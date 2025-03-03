package com.boudy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	
	@GetMapping("/showForm")
	public String showForm() {

		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {

		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShowData(HttpServletRequest request , Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hi, " + theName;
		model.addAttribute("message", result);	
		
		return "helloworld";
	}
	
	@GetMapping("/processFormVersionThree")
	public String letsShowDataVersion2(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Hi, " + theName;
		model.addAttribute("message", result);	
		
		return "helloworld";
	}
	
	@GetMapping("/processFormVersionFour")
	public String letsShowDataVersion3(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Hi , " + theName;
		model.addAttribute("message", result);	
		
		return "helloworld";
	}
	
}
