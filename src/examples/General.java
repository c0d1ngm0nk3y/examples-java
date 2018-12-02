package examples;

import java.math.BigInteger;
import java.util.Collection;

public class General {

	public static void main(String[] args) {
		System.out.println("Running...");
	}

	public static Boolean isDividableBy(Integer in, Integer by) {
		Integer zero = 0;

		Boolean isEven = zero.equals(in % by);

		return isEven;
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

	public static BigInteger sum(Collection<Integer> ints) {
		BigInteger sum = BigInteger.ZERO;

		for (var ii : ints) {
			sum = sum.add(BigInteger.valueOf(ii));
		}

		return sum;
	}

}
