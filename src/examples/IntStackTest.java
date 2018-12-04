package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntStackTest {

	@Test
	public void testEmpty() {
		IntStack stack = new IntStack(3);
		assertEquals(0, stack.size());
	}

	@Test
	public void testAddElements() {
		IntStack stack = new IntStack(3);
		stack.push(12);
		stack.push(23);

		assertEquals(2, stack.size());
		assertEquals(23, stack.peek());
		assertEquals(23, stack.pop());
		assertEquals(12, stack.pop());
		assertEquals(0, stack.size());
	}

	@Test(expected = Exception.class)
	public void testThrowWhenEmpty() {
		IntStack stack = new IntStack(3);
		stack.pop();
	}

	@Test(expected = Exception.class)
	public void testThrowWhenOverFull() {
		IntStack stack = new IntStack(1);
		stack.push(12);
		stack.push(12);
	}

	@Test
	public void testNotThrowingWhenFull() {
		IntStack stack = new IntStack(5);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
	}

}
