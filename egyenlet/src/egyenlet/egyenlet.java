package egyenlet;

import java.util.Scanner;

public class egyenlet {

	public static void main(String args[]) {
		
		int egyutt[] = new int[3];

		double discriminant = 0;
		double x1, x2 = 0;
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Kérem az 1. egyutthatót: ");
		egyutt[0] = sc.nextInt();
		
		System.out.println("Kérem az 2. egyutthatót: ");
		egyutt[1] = sc.nextInt();
		
		System.out.println("Kérem az 3. egyutthatót: ");
		egyutt[2] = sc.nextInt();
		
		sc.close();
		
		a = egyutt[0];
		b = egyutt[1];
		c = egyutt[2];
		
		discriminant = (b * b) - (4 * a * c);
		
		if(Double.isNaN(discriminant)) {
			System.out.println("Nincs valós megoldás!");
			
		}
			else {
			x1 =(b*(-1)+ Math.sqrt(discriminant)) / 2 * a;
			x2 =(b*(-1)- Math.sqrt(discriminant)) / 2 * a;
			System.out.println("A megoldás: x1 = " + x1 + "\tx2 = " + x2);
			}
		
		
	}
}

