package com.winocencio.passwordvalidator.service.rule;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RulePasswordOneUpperCaseTest {

	@Test
	void whenContainsOnlyDigitAssertFalse() {
		assertFalse(new RulePasswordOneUpperCase(null).isValid("123"));
	}
	
	@Test
	void whenContainsOnlySpaceAssertFalse() {
		assertFalse(new RulePasswordOneUpperCase(null).isValid(" "));
	}
	
	@Test
	void whenContainsOnlySpecialCharAssertFalse() {
		assertFalse(new RulePasswordOneUpperCase(null).isValid("¨&%¨!"));
	}
	
	@Test
	void whenContainsOnlyLowerCaseAssertFalse() {
		assertFalse(new RulePasswordOneUpperCase(null).isValid("aaaa"));
	}
	
	@Test
	void whenContainsOnlyUpperCaseAssertTrue() {
		assertTrue(new RulePasswordOneUpperCase(null).isValid("AAA"));
	}
	
	@Test
	void whenContainsManyCharacterAndUpperCaseAssertTrue() {
		assertTrue(new RulePasswordOneUpperCase(null).isValid("AAaa1256¨&? "));
	}
	
	@Test
	void whenContainsManyCharacterAndNotUpperCaseAssertFalse() {
		assertFalse(new RulePasswordOneUpperCase(null).isValid("aa1256¨&? "));
	}

}
