package szemely;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Szemely[] array = new Szemely[1];
		System.out.println("Adja meg a szem�ly nev�t ");
		String nev = sc.next();
		System.out.println("Adja meg a szem�ly t�meg�t: ");
		int tomeg = sc.nextInt();
		System.out.println("Adja meg a szem�ly magass�g�t (m�terben): ");
		double magassag = sc.nextDouble();

		array[0] = new Szemely(nev, tomeg, magassag);

		sc.close();

		System.out.println(array[0].toString());

	}

}
