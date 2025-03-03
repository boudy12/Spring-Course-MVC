package com.boudy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boudy.mvc.model.Student;

@Controller
public class StudentController {

	
	@Value("${countries}")
	private List<String> countries;
	
	@Value("${favoriteLanguages}")
	private List<String> favoriteLanguages;
	
	@Value("${favoriteOS}")
	private List<String> favoriteOS;
	
	@GetMapping("/showStudentForm")
	public String showForm(Model model) {

		Student student = new Student();
		
		model.addAttribute("student",student);
		
		model.addAttribute("countries",countries);
		
		model.addAttribute("favoriteLanguages",favoriteLanguages);
		
		model.addAttribute("favoriteOS",favoriteOS);
		
		return "student-form";
	}
	
	@PostMapping("/processstuedntform")
	public String processStuedntForm(@ModelAttribute("student") Student student) {


		System.out.printf("the Student : " + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry() 
							+ " " + student.getFavoriteLanguage() + " " + student.getFavoriteOS() 
				);
		
		return "student-confimation";
	}
	
	
}
