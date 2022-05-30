package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


class RulePasswordLengthTest {
	
	@Test
	void whenPasswordContains9CharacterAssertTrue() {
		assertTrue(new RulePasswordLength(null).isValid("123456789"));
	}
	
	@Test
	void whenPasswordContains10CharacterAssertTrue() {
		assertTrue(new RulePasswordLength(null).isValid("0123456789"));
	}
	
	@Test
	void whenPasswordContains8CharacterAssertFalse() {
		assertFalse(new RulePasswordLength(null).isValid("12345678"));
	}
	
	@Test
	void whenPasswordContainsNoneCharacterAssertFalse() {
		assertFalse(new RulePasswordLength(null).isValid(""));
	}
	
	@Test
	void whenPasswordContains17CharacterAssertFalse() {
		assertFalse(new RulePasswordLength(null).isValid("12345678901234567"));
	}

}
