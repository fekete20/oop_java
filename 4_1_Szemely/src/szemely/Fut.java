package szemely;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Szemely[] array = new Szemely[1];
		System.out.println("Adja meg a személy nevét ");
		String nev = sc.next();
		System.out.println("Adja meg a személy tömegét: ");
		int tomeg = sc.nextInt();
		System.out.println("Adja meg a személy magasságát (méterben): ");
		double magassag = sc.nextDouble();

		array[0] = new Szemely(nev, tomeg, magassag);

		sc.close();

		System.out.println(array[0].toString());

	}

}
