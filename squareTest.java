package testingJunit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testing the square function
 */

public class squareTest {

	@Test
	public void test() {
		Testing test = new Testing();
		int output = test.square(5);
		assertEquals(25, output);
		
	}

}
