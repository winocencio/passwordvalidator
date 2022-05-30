package com.winocencio.passwordvalidator.service.rule;

public abstract class RulePassword {
	
	private RulePassword next;
	
	protected RulePassword(RulePassword next) {
		this.next = next;
	}
	
	protected boolean isValidNext(String password) {
        if (next == null)
            return true;
        return next.isValid(password);
    }
	
	public abstract Boolean isValid(String password);
}
