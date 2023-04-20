import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

class FizzBuzzTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}

}
