package com.muhammedessa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.muhammedessa.Service.loginService;

@Controller
@SessionAttributes("name")

public class LoginController {
	
////	loginService LoginService = new loginService();
//	@Autowired
//	loginService LoginService ;
//	
//	 @RequestMapping(value = "/login" , method = RequestMethod.GET)
//	 //@ResponseBody
//	 public String loginPage() {
//		 return "login";
//	 }
//	 
//	 
//	 
//	 @RequestMapping(value = "/login" , method = RequestMethod.POST)
//	 //@ResponseBody
//	 public String getInfo(@RequestParam String name , @RequestParam String password , ModelMap model) {
//		 
//		 if(LoginService.loginValidate(name, password)) {
//			 model.put("name", name);
//			 model.put("password", password);
//			 return "home" ;
//		 }else {
//			 model.put("erorrMs", "Name OR Password invalid");
//			 return "login" ;
//		}
//		
//		
//	 }
//
//	 
//	 @RequestMapping(value = "/home" , method = RequestMethod.GET)
//	 //@ResponseBody
//	 public String homePage() {
//		 return "home";
//	 }
//	 
//	 
//	 
	 
}
