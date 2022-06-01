package com.winocencio.passwordvalidator.service.rule;

import java.util.Set;
import java.util.stream.Collectors;

public class RulePasswordNotSameCharacter extends RulePassword {
	
	public RulePasswordNotSameCharacter(RulePassword nextRule) {
		super(nextRule);
	}

	@Override
	public Boolean isValid(String password) {
		
		Set<Character> charsSet = password.chars()
			    .mapToObj(e->(char)e).collect(Collectors.toSet());
		
		if(password.length() != charsSet.size())
			return false;
		
		return isValidNext(password);
	}
}
