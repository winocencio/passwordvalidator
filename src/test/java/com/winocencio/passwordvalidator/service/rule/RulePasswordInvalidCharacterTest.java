package com.winocencio.passwordvalidator.service.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class RulePasswordInvalidCharacterTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordInvalidCharacter(null);
	}

	@Test
	void whenContainsOnlyDigitAssertTrue() {
		assertTrue(rulePassword.isValid("123"));
	}
	
	@Test
	void whenContainsOnlySpaceAssertFalse() {
		assertFalse(rulePassword.isValid(" "));
	}
	
	@Test
	void whenContainsAPhraseAssertFalse() {
		assertFalse(rulePassword.isValid("Good Boy"));
	}	
	
	@Test
	void whenContainsOnlyUpperCaseAssertTrue() {
		assertTrue(rulePassword.isValid("AAA"));
	}
	
	@Test
	void whenContainsManyCharacterAndFinalSpaceAssertFalse() {
		assertFalse(rulePassword.isValid("aa1256¨&? "));
	}

}
