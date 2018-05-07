package szemely;

public class Szemely {
	private String nev;
	private int tomeg;
	private double magassag;

	public Szemely(String nev, int tomeg, double magassag) {
		this.nev = nev;
		this.tomeg = tomeg;
		this.magassag = magassag;
	}

	public static String ttiSzamol(int tomeg, double magassag) {
		if ((tomeg / (magassag * magassag)) < 18.5) {
			return "sovány";
		}
		if ((tomeg / (magassag * magassag)) > 25)
			return "kövér";

		else
			return "normál";
	}

	@Override
	public String toString() {
		return "Név: " + nev + ", tömeg: " + tomeg + ", magasság: " + magassag + " méter" + ", alkat: "
				+ ttiSzamol(tomeg, magassag);
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getNev() {
		return nev;
	}

	public void setTomeg(int tomeg) {
		this.tomeg = tomeg;
	}

	public int getTomeg() {
		return tomeg;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public double getMagassag() {
		return magassag;
	}

}
