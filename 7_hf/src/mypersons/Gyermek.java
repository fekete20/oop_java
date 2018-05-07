package mypersons;

public class Gyermek extends Person {
	private String school;

	public Gyermek(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	@Override
	public String toString() {
		return "Gyermek --> Név: " + super.getName() + ", Kor: " + super.getAge() + ", Iskola: " + getSchool();
	}

	public String getSchool() {
		return school;
	}

}
