package examples;

public class IntStack {

	public IntStack(int size) {
		nextIndex = 0;
		array = new int[size];
	}

	// show the top element
	public int peek() throws StackIsEmptyException // throws
	{
		if (0 == size()) {
			throw new StackIsEmptyException();
		}

		return array[nextIndex - 1];
	}

	// return number of stored elements
	public int size() {
		return nextIndex;
	}

	// store an element
	public void push(int number) throws StackIsFullException // throws
	{
		if (size() == array.length) {
			throw new StackIsFullException();
		}

		array[nextIndex++] = number;
	}

	// return and remove the last stored element
	public int pop() throws StackIsEmptyException // throws
	{
		if (size() == 0) {
			throw new StackIsEmptyException();
		}

		return array[--nextIndex];
	}

	private int[] array;
	int nextIndex = 0;
}
