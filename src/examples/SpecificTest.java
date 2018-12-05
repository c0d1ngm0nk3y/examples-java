package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpecificTest {

	@Test
	public void testReader() throws Exception {
		var result = Specific.readFirstLineFromFile(".\\test.txt");
		assertEquals("test", result);
	}

}
