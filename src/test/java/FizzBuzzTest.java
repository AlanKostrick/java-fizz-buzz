import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	// arrange
	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldSayOneForOne() {
		// act
		String check = underTest.say(1);
		// assert
		assertEquals("1", check);
	}

	@Test
	public void shouldSayTwoForTwo() {
		String check = underTest.say(2);
		assertEquals("2", check);
	}
	
	@Test
	public void shouldSayFizzForThree() {
		String check = underTest.say(3);
		assertEquals("Fizz", check);
		
	}
	
	@Test
	public void shouldSayFourForFour() {
		String check = underTest.say(4);
		assertEquals("4", check);
	}
	
	@Test
	public void shouldSayBuzzForFive() {
		String check = underTest.say(5);
		assertEquals("Buzz", check);
	}
	
	@Test
	public void shouldSayFizzForSix() {
		String check = underTest.say(6);
		assertEquals("Fizz", check);
		
	}
	
	@Test
	public void shouldSayBuzzForTen() {
		String check = underTest.say(10);
		assertEquals("Buzz", check);
	}
	
	@Test
	public void shouldSayFizzBuzzForFifteen() {
		String check = underTest.say(15);
		assertEquals("FizzBuzz", check);
	}

}
