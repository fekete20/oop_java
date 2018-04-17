package gyak6_1;

public class Alkalmazott {

	private String name;
	private int age;
	private int payment;
	private static int ageLimit = 65; // akkor lesz osztályszintû, ha statikus

	public Alkalmazott(String name, int age, int payment) {
		this.name = name;
		this.age = age;
		this.payment = payment;
	}

	public Alkalmazott(String name, int age) {
		this.name = name;
		this.age = age;
		this.payment = 10000 * age;
	}

	public int getAgestoLimit() {
		return ageLimit - this.age;
	}

	public String toString() { // minden egyes objektumhoz visszaadja az adatait
								// szöveges formában
		return "Name: " + this.name + " Age: " + this.age + " Payment: " + this.payment + " Evek szama nyugdijig: "
				+ getAgestoLimit();
	}

	public static void setNyugdijkorhatar(int ageLimitIn) {
		ageLimit = ageLimitIn;
	}

	public Alkalmazott getAlkEveknyugdijig(Alkalmazott a1, Alkalmazott a2) {
		if (a1.getAgestoLimit() > a2.getAgestoLimit())
			return a1;
		else
			return a2;
	}

}
