package mypersons;

public class Employee extends Felnott {
	private int payment;
	private final int retage = 65;

	public Employee(String name, int age, String workplace, int payment) {
		super(name, age, workplace);
		this.payment = payment;
	}

	public int getPayment() {
		return payment;
	}

	@Override
	public String toString() {
		return "Employee --> N�v:" + super.getName() + ", Kor: " + super.getAge() + ", Munkahely: "
				+ super.getWorkplace() + ", Fizet�s: " + getPayment();
	}

}
