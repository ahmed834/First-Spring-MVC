package com.muhammedessa.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service

public class UserInfoStatus {
	
	public String getLoggedName() {
		Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principle instanceof UserDetails ) {
			return ((UserDetails)principle).getUsername();
		}
		return principle.toString();
	}
	
	public boolean isUserLoggedIn() {
		Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principle instanceof UserDetails ) {
			return true;
		}
		return false;
	}
	

}
