package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
	
	@Test
	public void should_return_1_when_fizzBuzz_given_1(){
		
		// Given
		int number = 1;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
	
		// When
		String word = fizzBuzzNumberGame.fizzBuzz(number);
	
		// Then
		Assertions.assertEquals("1", word);
	}
	
	@Test
	public void should_return_fizz_when_fizzBuzz_given_3() {
		
		// Given
		int number = 3;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// When
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		
		// Then
		Assertions.assertEquals("fizz", word);		
	}
	
	@Test
	public void should_return_buss_when_fizzBuzz_given_5() {
		
		// Given
		int number = 5;
		FizzBuzzNumberGame fizzBuzzNumberGame = new FizzBuzzNumberGame();
		
		// When
		String word = fizzBuzzNumberGame.fizzBuzz(number);
		
		// Then
		Assertions.assertEquals("buzz", word);		
	}

}


