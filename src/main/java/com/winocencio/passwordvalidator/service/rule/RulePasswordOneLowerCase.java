package com.winocencio.passwordvalidator.service.rule;

public class RulePasswordOneLowerCase extends RulePassword {
	
	public RulePasswordOneLowerCase(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		
		if(password.equals(password.toUpperCase()))
			return false;
		
		return isValidNext(password);
	}
}
