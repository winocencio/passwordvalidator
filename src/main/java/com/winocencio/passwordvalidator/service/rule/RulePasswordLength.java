package com.winocencio.passwordvalidator.service.rule;

public class RulePasswordLength extends RulePassword {
	
	private static final Integer MIN_LENGTH_DEFAULT = 9;
	private static final Integer MAX_LENGTH_DEFAULT = 16;
	
	public RulePasswordLength(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		if(password.length() < MIN_LENGTH_DEFAULT)
			return false;
		
		if(password.length() > MAX_LENGTH_DEFAULT)
			return false;
		
		return isValidNext(password);
	}
}
