package pitagorasz_szamharmasok;

public class szamharmasok {
	public static void main(String[] args) {
		for (int a = 1; a <= 50; a++) {
			for (int b = 1; b <= 50; b++) {
				for (int c = 1; c <= 50; c++) {
					if (((a * a) + (b * b)) == (c * c) && (a < b) && (b < c)) {
						System.out.println("(" + a + ", " + b + ", " + c + ")");
					}
				}
			}
		}
	}

}
