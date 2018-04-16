package euler_number;

public class e {
	public static void main(String[] args) {

		double e = 0;

		for (int i = 0; i < 34; i++) {
			e += 1 / (double) factorial(i);
		}

		System.out.println("e= " + e);

	}

	public static double factorial(long i) {
		int fact = 1;

		if (i == 0) {
			fact = 1;
		} else {
			for (int j = 1; j <= i; j++) {
				fact *= j;
			}
		}
		return (long) fact;
	}

}