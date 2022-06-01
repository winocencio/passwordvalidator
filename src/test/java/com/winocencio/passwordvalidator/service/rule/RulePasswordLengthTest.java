package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class RulePasswordLengthTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordLength(null);
	}
	
	@Test
	void whenPasswordContains9CharacterAssertTrue() {
		assertTrue(rulePassword.isValid("123456789"));
	}
	
	@Test
	void whenPasswordContains10CharacterAssertTrue() {
		assertTrue(rulePassword.isValid("0123456789"));
	}
	
	@Test
	void whenPasswordContains8CharacterAssertFalse() {
		assertFalse(rulePassword.isValid("12345678"));
	}
	
	@Test
	void whenPasswordContainsNoneCharacterAssertFalse() {
		assertFalse(rulePassword.isValid(""));
	}
	
	@Test
	void whenPasswordContains17CharacterAssertFalse() {
		assertFalse(rulePassword.isValid("12345678901234567"));
	}

}
