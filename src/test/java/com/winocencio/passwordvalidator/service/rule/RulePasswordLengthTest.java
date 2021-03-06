package com.winocencio.passwordvalidator.service.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
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
