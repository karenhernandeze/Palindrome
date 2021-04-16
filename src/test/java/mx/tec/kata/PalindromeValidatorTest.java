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
	
	@Test
	void Given2DifferentLettersStringWhenValidatingPalindromeThenFalse() {
		
		// Given
		String string = "ab";
				
		// When
		boolean actualResult = validator.validate(string);
				
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given2EqualLettersStringWhenValidatingPalindromeThenTrue() {
		
		// Given
		String string = "aa";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
    void Given3LettersPalindromeStringWhenValidatingPalindromeThenTrue() {
		
        // Given
        String string = "aba";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given4LettersPalindromeStringWhenValidatingPalindromeThenTrue() {
		
        // Given
        String string = "abba";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void Given4LettersPalindromeStringWhenValidatingPalindromeThenFalse() {
		
        // Given
        String string = "abda";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);

    } 
	
	@Test
    void GivenASentencePalindromeStringWhenValidatingPalindromeThenTrue() {
		
        // Given
        String string = "a man a plan a canal panama";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);

    }
	
	@Test
    void GivenANonPalindromeStringWhenValidatingPalindromeThenFalse() {
		
        // Given
        String string = "a man in a plan a canal panama";
        // When
        boolean actualResult = validator.validate(string);

        // Then
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);

    }

}
