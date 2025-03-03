package com.boudy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	
	@GetMapping("/hello")
    public String home(Model model) {
        model.addAttribute("title", java.time.LocalDateTime.now());
        return "helloworld";
    }
}
