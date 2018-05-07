package test;

import java.util.Scanner;

import mypersons.*;

public class Fut {

	public static void main(String[] args) {
//		Person p1;
//		Person p2;
		Scanner sc = new Scanner(System.in);

/**		
		
		System.out.println("Kérem az elsõ személy nevét:");
		String name = sc.next();
		System.out.println("Kérem az elsõ személy korát:");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("Kérem az elsõ személy iskoláját: ");
			String school = sc.next();
			p1 = new Gyermek(name, age, school);
		} else {
			System.out.println("Kérem az elsõ személy munkahelyét: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
				p1 = new Felnott(name, age, workplace);	
				} else {
					System.out.println("Kérem az elsõ személy fizetését: ");
					int payment = sc.nextInt();
					p1 = new Employee(name, age, workplace, payment);
				}
			
		}

		System.out.println("Kérem a második személy nevét:");
		name = sc.next();
		System.out.println("Kérem a második személy korát:");
		age = sc.nextInt();

		if (age < 18) {
			System.out.println("Kérem a második személy iskoláját: ");
			String school = sc.next();
			p2 = new Gyermek(name, age, school);
		} else {
			System.out.println("Kérem a második személy munkahelyét: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
			p2 = new Felnott(name, age, workplace);	
			} else {
				System.out.println("Kérem a második személy fizetését: ");
				int payment = sc.nextInt();
				p2 = new Employee(name, age, workplace, payment);
			}
			
		}

		// Létrejött objektumok típusa

		System.out.println("Az elsõ személy gyermek: " + (p1 instanceof Gyermek)); // visszaadja, hogy p1 Gyermek
																					// típussal jött-e létre
		System.out.println("Az elso szemely adatai: " + p1.toString());
		System.out.println("A második személy gyermek: " + (p2 instanceof Gyermek));
		System.out.println("A második szemely adatai: " + p2.toString());
		
**/		

		// Itt módosítom úgy, hogy a személyek tömbbe kerülnek:
		
		int n;
	
		System.out.println("Hány személyt szeretne beírni?");
		n = sc.nextInt();
		
		Person[] ps = new Person[n];
		
		for(int i=0; i < ps.length; i++)  {
		System.out.println("Kérem a(z) " + (i+1) +". személy nevét:");
		String name = sc.next();
		System.out.println("Kérem a(z) " + (i+1) + ". személy korát:");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("Kérem a(z) " + (i+1) + ". személy iskoláját: ");
			String school = sc.next();
			ps[i] = new Gyermek(name, age, school);
		} else {
			System.out.println("Kérem a(z) " + (i+1) + ". személy munkahelyét: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
				ps[i] = new Felnott(name, age, workplace);	
				} else {
					System.out.println("Kérem a(z) " + (i+1) + ". személy fizetését: ");
					int payment = sc.nextInt();
					ps[i] = new Employee(name, age, workplace, payment);
				}
			
		}
		
		}
		
		for(int i=0; i < ps.length; i++) {
			System.out.println((i+1) + ". " + ps[i].toString());
		}
		
		System.out.println("");
		
		// életkor szerint növekvõen rendezés:
		
		int minindex;
		for(int i = 0; i < ps.length; i++) {
			minindex = i;
			for(int j = i + 1; j < ps.length; j++) {
				if(ps[j].getAge() < ps[minindex].getAge()) {
				minindex = j;
				}
			}
		
		Person temp;
		temp = ps[minindex];
		ps[minindex] = ps[i];
		ps[i] = temp;
		}
		
		// rendezett tömb kiírása:
		
		System.out.println("Életkor szerint növekvõen a személyek: \n");
		for(Person p : ps) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
