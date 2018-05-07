package szampar;

public class Szampar1_100 {

	public static void main(String[] args) {
		
		int db = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (i != j) {
					// System.out.println("(" + i + "," + j + ")");
					if (isPrime(i) && isPrime(j) && (j - i) == 2) {
						db++;
						System.out.println("(" + i + "," + j + ")");
					}
				}
			}
		}
		
		System.out.println(db + " darab ikerprím van 1 és 100 között.");
	}

	public static boolean isPrime(int number) {

		if (number < 2)
			return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

}
