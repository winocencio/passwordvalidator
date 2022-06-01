package com.winocencio.passwordvalidator.service;

import org.springframework.stereotype.Service;

import com.winocencio.passwordvalidator.service.rule.RulePasswordLength;
import com.winocencio.passwordvalidator.service.rule.RulePasswordNotSameCharacter;
import com.winocencio.passwordvalidator.service.rule.RulePasswordOneLowerCase;
import com.winocencio.passwordvalidator.service.rule.RulePasswordOneSpecialCharacter;
import com.winocencio.passwordvalidator.service.rule.RulePasswordOneUpperCase;

@Service
public class PasswordValidatorService {

	public Boolean isValid(String password) {
		return new RulePasswordLength(
					new RulePasswordOneUpperCase(
							new RulePasswordOneLowerCase(
									new RulePasswordOneSpecialCharacter(
											new RulePasswordNotSameCharacter(null)))))
				.isValid(password);
	}
}
