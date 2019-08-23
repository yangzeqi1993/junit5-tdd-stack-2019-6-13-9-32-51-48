package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
	
	@Test
	public void should_return_1_when_fizzBuzz_given_1(){
		
		// Given
		int number = 1;
		FizzBussNumberGame fizzBussNumberGame = new FizzBussNumberGame();
	
		// When
		String word = fizzBussNumberGame.fizzBuzz(number);
	
		// Then
		Assertions.assertEquals("1", word );
	}
	
	@Test
	public void should_return_fizz_when_fizzBuzz_given_3() {
		
		// Given
		int number = 3;
		FizzBussNumberGame fizzBussNumberGame = new FizzBussNumberGame();
		
		// When
		String word = fizzBussNumberGame.fizzBuzz(number);
		
		// Then
		Assertions.assertEquals("fizz", word);
		
	}

}


