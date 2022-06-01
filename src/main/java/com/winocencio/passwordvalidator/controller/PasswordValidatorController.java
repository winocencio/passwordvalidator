package com.winocencio.passwordvalidator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.winocencio.passwordvalidator.service.PasswordValidatorService;

@RestController
public class PasswordValidatorController {
	
	@Autowired
	PasswordValidatorService passwordValidatorService;
	
	@GetMapping("passwordValidator/{password}")
	public Boolean isValid(@PathVariable String password) {
		return passwordValidatorService.isValid(password);
	}
}
