package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RulePasswordOneLowerCaseTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordOneLowerCase(null);
	}

	@Test
	void whenContainsOnlyDigitAssertFalse() {
		assertFalse(rulePassword.isValid("123"));
	}
	
	@Test
	void whenContainsOnlySpaceAssertFalse() {
		assertFalse(rulePassword.isValid(" "));
	}
	
	@Test
	void whenContainsOnlySpecialCharAssertFalse() {
		assertFalse(rulePassword.isValid("¨&%¨!"));
	}
	
	@Test
	void whenContainsOnlyLowerCaseAssertTrue() {
		assertTrue(rulePassword.isValid("aaaa"));
	}
	
	@Test
	void whenContainsOnlyUpperCaseAssertFalse() {
		assertFalse(rulePassword.isValid("AAA"));
	}
	
	@Test
	void whenContainsManyCharacterAndUpperCaseAssertTrue() {
		assertTrue(rulePassword.isValid("AAaa1256¨&? "));
	}
	
	@Test
	void whenContainsManyCharacterAndNotUpperCaseAssertFalse() {
		assertFalse(rulePassword.isValid("AA1256¨&? "));
	}

}
