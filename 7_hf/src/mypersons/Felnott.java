package mypersons;

public class Felnott extends Person {
	private String workplace;

	public Felnott(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
	}

	@Override
	public String toString() {
		return "Felnõtt --> Név: " + super.getName() + ", Kor: " + super.getAge() + ", Munkahely: " + getWorkplace();
	}

	public String getWorkplace() {
		return workplace;
	}

}
