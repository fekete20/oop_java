package sajat.masodik;

import sajat.elso.Szam;

public class Fut {

	public static void main(String[] args) {
		final Szam szam = new Szam(Math.random());
		double veletlenSzam;
		int db = 0;

		do {
			db++;
			veletlenSzam = Math.random();
			System.out.println("Ezt a számot generáltam: " + veletlenSzam);
		} while (!szam.turesenbelul(veletlenSzam));

		System.out.println(db + ". kísérletre találtam egyezõ számot.");

		System.out.println("A konstans szám adattagjának értéke: " + szam.getSzam());

		// meg lehet-e változtatni a szám adattagjának értékét? -- igen

		szam.setSzam(531.4);
		System.out.println("Megváltoztattam a szám adattagjának értékét: " + szam.getSzam());

		// a referencia értéke final, ezért nem tudom megváltoztatni

	}

}
