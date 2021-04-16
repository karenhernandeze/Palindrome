package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {

	PalindromeValidator validator = new PalindromeValidator();

	@Test
	void GivenSingleLetterStringWhenValidatingPalindromeThenTrue() {
		//GIVEN 
		String string = "a";
		
		//WHEN
		boolean actualResult = validator.validate(string);
		
		//THEN
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
	}

}
