package sajat.elso;

public class Szam {
	final private double tures = 0.001;
	private double szam;

	public Szam(double szam) {
		this.szam = szam;
	}

	public boolean turesenbelul(double szam) {
		return Math.abs(this.szam - szam) < tures;
	}

	public void setSzam(double szam) {
		this.szam = szam;
	}

	public double getSzam() {
		return szam;
	}

}
