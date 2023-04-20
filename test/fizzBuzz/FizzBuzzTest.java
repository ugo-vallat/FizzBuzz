package fizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();

	}

	@Test
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1", fb.fizzBuzz(1));
	}

	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2", fb.fizzBuzz(2));
	}

	@Test
	void fizzbuzz_repond_fizz_pour_3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}

	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("2", fb.fizzBuzz(2));
		assertEquals("7", fb.fizzBuzz(7));
		assertEquals("14", fb.fizzBuzz(14));
		assertEquals("31", fb.fizzBuzz(31));
	}

	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz", fb.fizzBuzz(5));
	}

	@Test
	void fizzbuzz_repond_correctement_pour_un_multiple() {
		assertEquals("fizz", fb.fizzBuzz(6));
		assertEquals("buzz", fb.fizzBuzz(400));
	}

	@Test
	void fizzbuzz_repond_fizzbuzz_pour_multiples_3_et_5() {
		assertEquals("fizzbuzz", fb.fizzBuzz(15));
		assertEquals("fizzbuzz", fb.fizzBuzz(30));
		assertEquals("fizzbuzz", fb.fizzBuzz(75));
	}

}
