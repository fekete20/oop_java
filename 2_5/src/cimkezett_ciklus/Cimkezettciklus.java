package cimkezett_ciklus;

public class Cimkezettciklus {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			aa: for (int j = 1; j <= 5; j++) {
				System.out.print(i);
				if (i == j)
					break aa;
			}
		
			System.out.println("");
		}

	}

}
