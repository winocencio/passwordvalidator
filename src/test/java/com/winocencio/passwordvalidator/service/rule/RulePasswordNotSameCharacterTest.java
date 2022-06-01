package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RulePasswordNotSameCharacterTest {
	
	private RulePassword rulePassword;

	@BeforeAll
	void setUp() {
		rulePassword = new RulePasswordNotSameCharacter(null);
	}

	@Test
	void whenContainsNoneCharactersAssertTrue() {
		assertTrue(rulePassword.isValid(""));
	}
	
	@Test
	void whenContainsTwoSameCharUpperAndLowerAssertTrue() {
		assertTrue(rulePassword.isValid("Aa"));
	}
	
	@Test
	void whenContainsNotSameCharAssertTrue() {
		assertTrue(rulePassword.isValid("abc"));
	}
	
	@Test
	void whenContainsSameCharAssertFalse() {
		assertFalse(rulePassword.isValid("AAA"));
	}
}
