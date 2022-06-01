package com.winocencio.passwordvalidator.service.rule;

public class RulePasswordInvalidCharacter extends RulePassword {
	
	private static final String INVALID_CHAR_SPACE = " ";
	
	public RulePasswordInvalidCharacter(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		
		if(password.contains(INVALID_CHAR_SPACE))
			return false;
		
		return isValidNext(password);
	}
}
