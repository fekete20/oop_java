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
			System.out.println("Ezt a sz�mot gener�ltam: " + veletlenSzam);
		} while (!szam.turesenbelul(veletlenSzam));

		System.out.println(db + ". k�s�rletre tal�ltam egyez� sz�mot.");

		System.out.println("A konstans sz�m adattagj�nak �rt�ke: " + szam.getSzam());

		// meg lehet-e v�ltoztatni a sz�m adattagj�nak �rt�k�t? -- igen

		szam.setSzam(531.4);
		System.out.println("Megv�ltoztattam a sz�m adattagj�nak �rt�k�t: " + szam.getSzam());

		// a referencia �rt�ke final, ez�rt nem tudom megv�ltoztatni

	}

}
