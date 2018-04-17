package gyak6_1;

import java.util.Scanner;

/**
 * 
 * @author fekete20
 *
 */
public class Alkalmazottfut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Kerem az alkalmazottak szamat:");
		int numberOfEmp = sc.nextInt();

		Alkalmazott[] alkArray = new Alkalmazott[numberOfEmp];

		for (int i = 0; i < alkArray.length; i++) {
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott nevet:");
			String name = sc.next();
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott korat:");
			int age = sc.nextInt();
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott fizeteset:");
			int payment = sc.nextInt();

			alkArray[i] = new Alkalmazott(name, age, payment);

		}

		sc.close();

		for (Alkalmazott a : alkArray)
			System.out.println(a.toString());

		Alkalmazott.setNyugdijkorhatar(30);

		System.out.println("");

		for (Alkalmazott a : alkArray)
			System.out.println(a.toString());

		for (Alkalmazott a : alkArray) {
			if (a.getAgestoLimit() < 5)
				System.out.println(a.toString());
		}

		System.out.println("");

		int sum = 0;
		double ageAverage = 0.0;

		for (int i = 0; i < numberOfEmp; i++) {
			sum += alkArray[i].getAgestoLimit();
		}

		/*
		 * for(Alkalmazott a : alkArray){ sum += alkArray[i].getAgestoLimit(); }
		 */

		ageAverage = (double) sum / (double) numberOfEmp;

		for (Alkalmazott a : alkArray) {
			if (a.getAgestoLimit() > ageAverage)
				System.out.println(a.toString());
		}

		Alkalmazott[] sortedArray = new Alkalmazott[alkArray.length];
		Alkalmazott temp;
		for (int j = 0; j < alkArray.length - 1; j++) {
			for (int i = 0; i < alkArray.length - 1; i++) {
				if (alkArray[i].getAgestoLimit() > alkArray[i + 1].getAgestoLimit()) {
					temp = alkArray[i];
					alkArray[i] = alkArray[i + 1];
					alkArray[i + 1] = temp;
					sortedArray = alkArray;
				}
			}
		}
	}
}
