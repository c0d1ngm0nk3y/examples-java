package examples;

import java.math.BigInteger;
import java.util.List;

public class General {

	public static void main(String[] args) {
		System.out.println("Running...");
	}

	public static Boolean isDividableBy(Integer in, Integer by) {
		Integer zero = 0;

		Boolean isOdd = (in % by == zero);

		return isOdd;
	}

	public static int getTeaTemperature(String kind) throws Exception {
		kind.toUpperCase();

		if (kind == "BLACK") {
			return 100;
		} else if (kind == "GREEN") {
			return 80;
		} else if (kind == "WHITE") {
			return 85;
		} else if (kind == "OOLONG") {
			return 90;
		} else if (kind == "HERBAL") {
			return 100;
		} else {
			throw new Exception("Unknown tea");
		}

	}

	public static BigInteger sum(List<Integer> ints) {
		BigInteger sum = BigInteger.ZERO;

		for (int ii = 0; ii < ints.size(); ii++) {
			sum = sum.add(BigInteger.valueOf(ints.get(ii)));
		}

		return sum;
	}

}
