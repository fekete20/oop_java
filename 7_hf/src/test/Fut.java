package test;

import java.util.Scanner;

import mypersons.*;

public class Fut {

	public static void main(String[] args) {
//		Person p1;
//		Person p2;
		Scanner sc = new Scanner(System.in);

/**		
		
		System.out.println("K�rem az els� szem�ly nev�t:");
		String name = sc.next();
		System.out.println("K�rem az els� szem�ly kor�t:");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("K�rem az els� szem�ly iskol�j�t: ");
			String school = sc.next();
			p1 = new Gyermek(name, age, school);
		} else {
			System.out.println("K�rem az els� szem�ly munkahely�t: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
				p1 = new Felnott(name, age, workplace);	
				} else {
					System.out.println("K�rem az els� szem�ly fizet�s�t: ");
					int payment = sc.nextInt();
					p1 = new Employee(name, age, workplace, payment);
				}
			
		}

		System.out.println("K�rem a m�sodik szem�ly nev�t:");
		name = sc.next();
		System.out.println("K�rem a m�sodik szem�ly kor�t:");
		age = sc.nextInt();

		if (age < 18) {
			System.out.println("K�rem a m�sodik szem�ly iskol�j�t: ");
			String school = sc.next();
			p2 = new Gyermek(name, age, school);
		} else {
			System.out.println("K�rem a m�sodik szem�ly munkahely�t: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
			p2 = new Felnott(name, age, workplace);	
			} else {
				System.out.println("K�rem a m�sodik szem�ly fizet�s�t: ");
				int payment = sc.nextInt();
				p2 = new Employee(name, age, workplace, payment);
			}
			
		}

		// L�trej�tt objektumok t�pusa

		System.out.println("Az els� szem�ly gyermek: " + (p1 instanceof Gyermek)); // visszaadja, hogy p1 Gyermek
																					// t�pussal j�tt-e l�tre
		System.out.println("Az elso szemely adatai: " + p1.toString());
		System.out.println("A m�sodik szem�ly gyermek: " + (p2 instanceof Gyermek));
		System.out.println("A m�sodik szemely adatai: " + p2.toString());
		
**/		

		// Itt m�dos�tom �gy, hogy a szem�lyek t�mbbe ker�lnek:
		
		int n;
	
		System.out.println("H�ny szem�lyt szeretne be�rni?");
		n = sc.nextInt();
		
		Person[] ps = new Person[n];
		
		for(int i=0; i < ps.length; i++)  {
		System.out.println("K�rem a(z) " + (i+1) +". szem�ly nev�t:");
		String name = sc.next();
		System.out.println("K�rem a(z) " + (i+1) + ". szem�ly kor�t:");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("K�rem a(z) " + (i+1) + ". szem�ly iskol�j�t: ");
			String school = sc.next();
			ps[i] = new Gyermek(name, age, school);
		} else {
			System.out.println("K�rem a(z) " + (i+1) + ". szem�ly munkahely�t: ");
			String workplace = sc.next();
			if(workplace.equals("null")) {
				ps[i] = new Felnott(name, age, workplace);	
				} else {
					System.out.println("K�rem a(z) " + (i+1) + ". szem�ly fizet�s�t: ");
					int payment = sc.nextInt();
					ps[i] = new Employee(name, age, workplace, payment);
				}
			
		}
		
		}
		
		for(int i=0; i < ps.length; i++) {
			System.out.println((i+1) + ". " + ps[i].toString());
		}
		
		System.out.println("");
		
		// �letkor szerint n�vekv�en rendez�s:
		
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
		
		// rendezett t�mb ki�r�sa:
		
		System.out.println("�letkor szerint n�vekv�en a szem�lyek: \n");
		for(Person p : ps) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
