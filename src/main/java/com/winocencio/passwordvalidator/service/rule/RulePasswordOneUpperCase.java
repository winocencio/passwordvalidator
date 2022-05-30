package com.winocencio.passwordvalidator.service.rule;

public class RulePasswordOneUpperCase extends RulePassword {
	
	public RulePasswordOneUpperCase(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		
		if(password.equals(password.toLowerCase()))
			return false;
		
		return isValidNext(password);
	}
}
