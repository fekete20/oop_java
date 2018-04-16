package gyak_5_1;

import java.util.Scanner;

public class Teglalapfut_2 {

	public static void main(String[] args) {
		Teglalap rectangles[] = new Teglalap[10];
		
		for(int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Teglalap((int)(Math.random()*9) + 2, (int)(Math.random()*9) + 2);
			System.out.println(rectangles[i].getAdatok());
		}
		
		int mini = 0;
		for(int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = i;
		}
		System.out.println("A legkisebb teruletu teglalap adatai: " + rectangles[mini].getAdatok());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kerem a teglalap a oldalat: ");
		int newA= sc.nextInt();
		System.out.println("Kerem a teglalap b oldalat: ");
		int newB= sc.nextInt();
		
		sc.close();
		
		Teglalap newRectangle = new Teglalap(newA, newB);
		
		int db = 0;
		for(Teglalap t : rectangles) {
			if(t.getTerulet() < newRectangle.getTerulet())
				db++;
		}
		System.out.println("A megadott uj teglalaptol kisebb teruletu teglalapok szama: " + db);
		
		System.out.println("");
		boolean isTrue = false;
		int index = 0;
		for(int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].getOldalakEgyeznekE(newRectangle)) {
				isTrue = true;
				index = i;
			}
		}
		
		if(isTrue)
			System.out.println("Az egyezo meretu teglalap indexe: " + index);
		else
			System.out.println("Nem volt egyezo meretu teglalap.");
			
		
	}


}

