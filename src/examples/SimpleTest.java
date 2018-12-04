package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void fuzzBuzz1() {
		assertEquals("1", Simple.toFizzBuzz(1));
	}

	@Test
	public void fuzzBuzz2() {
		assertEquals("2", Simple.toFizzBuzz(2));
	}

	@Test
	public void fuzzBuzz3() {
		assertEquals("Fizz", Simple.toFizzBuzz(3));
	}

	@Test
	public void fuzzBuzz6() {
		assertEquals("Fizz", Simple.toFizzBuzz(6));
	}

	@Test
	public void fuzzBuzz5() {
		assertEquals("Buzz", Simple.toFizzBuzz(5));
	}

	@Test
	public void fuzzBuzz10() {
		assertEquals("Buzz", Simple.toFizzBuzz(10));
	}

	@Test
	public void fuzzBuzz15() {
		assertEquals("FizzBuzz", Simple.toFizzBuzz(15));
	}

	@Test
	public void fuzzBuzz30() {
		assertEquals("FizzBuzz", Simple.toFizzBuzz(30));
	}

}
