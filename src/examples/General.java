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

	enum TeaKind {
		BLACK, WHITE, OOLONG, HERBAL, GREEN
	}

	public static int getTeaTemperature(TeaKind kind) throws Exception {

		switch (kind) {
		case BLACK:
		case HERBAL:
			return 100;
		case GREEN:
			return 80;
		case WHITE:
			return 85;
		case OOLONG:
			return 90;
		default:
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
