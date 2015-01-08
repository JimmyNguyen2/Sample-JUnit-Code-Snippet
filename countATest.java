package testingJunit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testing the countA function
 */

public class countATest {

	@Test
	public void test() {
		Testing test = new Testing();
		int output = test.countA("alphabet");
		assertEquals(2,output);
	}

}
