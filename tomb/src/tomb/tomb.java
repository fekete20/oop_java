package tomb;

import java.util.Random;

public class tomb {
	public static void main(String[] args) {
		
		int array[] = new int[10];
		Random rand = new Random();
		
		
		// felt�lt�s 1 �s 50 k�z�tti v�letlen sz�mokkal
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
		
		// ford�tott ki�r�s
		for(int i=0; i<array.length; i++){
			System.out.println(array[9-i] + " ");
		}
		
		// p�ros sz�mok kiv�logat�sa
		int paros[] = new int[10];
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) 
				paros[i] = array[i];
		}
		
		// legnagyobb sz�m megkeres�se
		int max = paros[0];
		for(int i=0; i<paros.length; i++) {
			if(paros[i] > max)
				max = paros[i];
		}
		System.out.println("A legnagyobb paros elem: " + max);
		
		
	}

}
