package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		int res = 0;
		String array[] = new String[10];
		String valasz = null;

		do {

			/*
			 * System.out.println("Kerem az 1. szamot!"); num1 = sc.nextInt();
			 * 
			 * System.out.println("Kerem az operandust!"); op = sc.next();
			 * 
			 * System.out.println("Kerem a 2. szamot!"); num2 = sc.nextInt();
			 */

			System.out.println("Kerem a muveletet!");
			array = sc.nextLine().split(" ");

			num1 = Integer.parseInt(array[0]);
			op = array[1];
			num2 = Integer.parseInt(array[2]);

			switch (op) {
			case "+":
				res = num1 + num2;
				break;

			case "*":
				res = num1 * num2;
				break;

			case "-":
				res = num1 - num2;
				break;

			case "/":
				if (num2 == 0)
					System.out.println("0-val nem lehet osztani!");
				else
					res = num1 / num2;
				break;
			}

			System.out.println("Az eredmeny: " + res);

			System.out.println("Folytatja?");

			valasz = sc.nextLine();

		} while (valasz.contentEquals("igen"));

		sc.close();
	}

}
