package com.muhammedessa.controllers;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muhammedessa.Service.StudentService;
import com.muhammedessa.Service.loginService;
import com.muhammedessa.security.UserInfoStatus;
import com.muhammedessa.validation.CustomValidation;

@Controller

public class StudentController {
	
//	loginService LoginService = new loginService();
	@Autowired
	StudentService studentService ;
	
	@Autowired
	CustomValidation customValidation ;
	
	@Autowired
	UserInfoStatus userInfoStatus;
	
	@RequestMapping(value = "/students" , method = RequestMethod.GET)
	public String showStudentPage(ModelMap model) {
		model.addAttribute("students" , studentService.readAllStudent());
		model.addAttribute("name" , userInfoStatus.getLoggedName() );
		System.out.println(userInfoStatus.isUserLoggedIn());
		return "students";
	}

	 
	@RequestMapping(value = "/add-student" , method = RequestMethod.GET)
	public String addStudentPage() {
		//throw new RuntimeException("This is test exception ");
		return "add";
		
	}
	
	@RequestMapping(value = "/add-student" , method = RequestMethod.POST)
	public String addToStudent(@RequestParam String name, @RequestParam String date ,ModelMap model) {
		if (customValidation.CheckNameValidation(name)) {
			studentService.addStudent( name, date, false);
			model.addAttribute("students" , studentService.readAllStudent());
			return "redirect:students";

		}else {
			model.addAttribute("ErorrVali" , "Name must be > 3");
			return "add-student";
		}
		
	}
	
	
	
	@RequestMapping(value = "/delete-student" , method = RequestMethod.GET)
	public String deleteStudent( @RequestParam int id , ModelMap model) {
		
		studentService.deleteStudent(id);
		model.clear();
		return "redirect:students";
	}
	
	
	
	@RequestMapping(value = "/edit-student" , method = RequestMethod.GET)
	public String editStudent( @RequestParam int id , ModelMap model) {
		
		model.addAttribute("student" , studentService.getinfo(id) );
		return "update-student";
	}
	
	
	
	@RequestMapping(value = "/update-student" , method = RequestMethod.POST)
	public String updateStudent( @RequestParam int id ,@RequestParam String name , @RequestParam String date , ModelMap model) {
		
		studentService.update(id, name, date, false);
		model.clear();
		return "redirect:students";
	}
	
	

	
	
	
	 
	 
}
