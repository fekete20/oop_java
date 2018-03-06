package tomb;

import java.util.Random;

public class tomb {
	public static void main(String[] args) {
		
		int array[] = new int[10];
		Random rand = new Random();
		
		
		// feltöltés 1 és 50 közötti véletlen számokkal
		for(int i=0; i<array.length; i++){
			array[i] = rand.nextInt(50)+1; 
//			array[i] = (int)(Math.random() * 50) + 1;
			System.out.println(array[i] + " ");
		}
		

/*
		for(int e : array) {
			System.out.println(e);
		}
*/
		
		System.out.println("\n");
		
		// fordított kiírás
		for(int i=0; i<array.length; i++){
			System.out.println(array[9-i] + " ");
		}
		
		// páros számok kiválogatása
		int paros[] = new int[10];
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) 
				paros[i] = array[i];
		}
		
		// legnagyobb szám megkeresése
		int max = paros[0];
		for(int i=0; i<paros.length; i++) {
			if(paros[i] > max)
				max = paros[i];
		}
		System.out.println("A legnagyobb paros elem: " + max);
		
		
	}

}
