package examples;

public class Simple {

	public static void main(String[] args) {
		Simple.printFizzBuzz(100);
	}

	public static String toFizzBuzz(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}

		return String.valueOf(number);
	}

	// - Print all numbers from 1 to <number>
	// - One number per line
	// - If the number is dividable by 3, print "Fizz" instead
	// - If the number is dividable by 5, print "Buzz" instead
	// - If the number is dividable by 3 AND 5, print "FizzBuzz" instead
	protected static void printFizzBuzz(int number) {
		for (int ii = 1; ii <= number; ii++) {
			System.out.println(toFizzBuzz(ii));
		}
	}

}
