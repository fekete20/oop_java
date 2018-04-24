package kivetel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] array = new int[5];

		try {
			readNextInt(array);
		} catch (PrimeException e) {
			e.printStackTrace();
		}
		// readNextLine(array);
		// readBRintValue(array);
		// readBRintLine(array);

		writeElements(array);

	}

	public static void writeElements(int[] arrayIn) {
		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("A t�mb " + (i + 1) + ". eleme: " + arrayIn[i]);
		}
	}

	public static void readNextInt(int[] arrayIn) throws PrimeException {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("K�rem a t�mb " + (i + 1) + ". elem�t: ");
			number = sc.nextInt();

			if (isPrime(number)) {
				arrayIn[i] = number;
			} else {
				throw new PrimeException("A beolvasott �rt�k nem pr�msz�m.");
			}
		}

		sc.close();
	}

	public static void readNextLine(int[] arrayIn) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("K�rem a t�mb " + (i + 1) + ". elem�t: ");
			String line = sc.nextLine();
			arrayIn[i] = Integer.parseInt(line);
		}
		sc.close();
	}

	public static void readBRintValue(int[] arrayIn) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("K�rem a t�mb " + (i + 1) + ". elem�t: ");
			String line = "";
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			arrayIn[i] = Integer.valueOf(line).intValue();
		}
		sc.close();
	}

	public static void readBRintLine(int[] arrayIn) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("K�rem a t�mb " + (i + 1) + ". elem�t: ");
			String line = "";
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			arrayIn[i] = Integer.parseInt(line);
		}
		sc.close();
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
