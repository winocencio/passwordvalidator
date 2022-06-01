package com.winocencio.passwordvalidator.service.rule;

import java.util.regex.Pattern;

public class RulePasswordOneSpecialCharacter extends RulePassword {
	
	public RulePasswordOneSpecialCharacter(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		Pattern specialChars = Pattern.compile("[!@#$%^&*()+-]");
		
		if(!specialChars.matcher(password).find())
			return false;
		
		return isValidNext(password);
	}
}
