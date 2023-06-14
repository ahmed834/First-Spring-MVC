package com.muhammedessa.validation;

import org.springframework.stereotype.Service;

@Service
public class CustomValidation {
	
	public boolean CheckNameValidation(String name ) {
		if(name.length() > 3 ) {
			return true;
		}else {
			return false;
		}
		
	}

}
