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
			return "sov�ny";
		}
		if ((tomeg / (magassag * magassag)) > 25)
			return "k�v�r";

		else
			return "norm�l";
	}

	@Override
	public String toString() {
		return "N�v: " + nev + ", t�meg: " + tomeg + ", magass�g: " + magassag + " m�ter" + ", alkat: "
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
