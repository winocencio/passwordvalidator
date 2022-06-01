package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class RulePasswordOneUpperCaseTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordOneUpperCase(null);
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
	void whenContainsOnlyLowerCaseAssertFalse() {
		assertFalse(rulePassword.isValid("aaaa"));
	}	
	
	@Test
	void whenContainsOnlyUpperCaseAssertTrue() {
		assertTrue(rulePassword.isValid("AAA"));
	}
	
	@Test
	void whenContainsManyCharacterAndUpperCaseAssertTrue() {
		assertTrue(rulePassword.isValid("AAaa1256¨&? "));
	}
	
	@Test
	void whenContainsManyCharacterAndNotUpperCaseAssertFalse() {
		assertFalse(rulePassword.isValid("aa1256¨&? "));
	}

}
