import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

class FizzBuzzTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}

	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}
}
