package com.winocencio.passwordvalidator.service;

import org.springframework.stereotype.Service;

import com.winocencio.passwordvalidator.service.rule.RulePasswordLength;

@Service
public class PasswordValidatorService {

	public Boolean isValid(String password) {
		return new RulePasswordLength(null).isValid(password);
	}
}
