package com.muhammedessa.Service;

import org.springframework.stereotype.Service;


@Service

public class loginService {
	
	public boolean loginValidate(String name , String password) {
		if(name.equals("Ahmed" ) && password.equals("123") ) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
