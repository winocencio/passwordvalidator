package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class RulePasswordOneSpecialCharacterTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordOneSpecialCharacter(null);
	}

	@Test
	void whenContainsNoneCharactersAssertFalse() {
		assertFalse(rulePassword.isValid(""));
	}
	
	@Test
	void whenContainsSomeOneSpecialCharacterAssertTrue() {
		assertTrue(rulePassword.isValid("!"));
		assertTrue(rulePassword.isValid("@"));
		assertTrue(rulePassword.isValid("#"));
		assertTrue(rulePassword.isValid("$"));
		assertTrue(rulePassword.isValid("%"));
		assertTrue(rulePassword.isValid("^"));
		assertTrue(rulePassword.isValid("&"));
		assertTrue(rulePassword.isValid("*"));
		assertTrue(rulePassword.isValid("("));
		assertTrue(rulePassword.isValid(")"));
		assertTrue(rulePassword.isValid("-"));
		assertTrue(rulePassword.isValid("+"));
	}
}
