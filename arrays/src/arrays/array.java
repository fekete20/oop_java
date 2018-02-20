package arrays;

public class array {
	public static void main(String[] args) {
		int[] array = new int[10];	// tömb létrehozása
		
		for(int i=0; i<array.length; i++){
			array[i] = i+1;
			System.out.println("A(z) " + (i+1) + ". elem: "+array[i]);
		}
		
		int max = array[0];
			for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("A legnagyobb elem értéke: " + max);
		
		int min = array[0];
			for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("A legkisebb elem értéke: " + min);
		
		int keresett = 5;
			for(int i=0; i<array.length; i++) {
			if(array[i]==keresett) {
				System.out.println("Van ilyen elem.");
				}
				else {
					System.out.println("Nincs ilyen elem.");
				}
			}
		
			
	}
}