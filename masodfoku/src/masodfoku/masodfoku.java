package masodfoku;

public class masodfoku {

	public static void main(String args[]) {
		
		int a = 5;
		int b = 20;
		int c = 2;
		double discriminant = 0;
		double x1, x2 = 0;
		
		discriminant = Math.sqrt((b * b) - 4 * a * c);
		
		if(Double.isNaN(discriminant)) {
			System.out.println("Nincs val�s megold�s!");
			
		}
			else {
			x1 =(b*(-1)+discriminant) / 2 * a;
			x2 =(b*(-1)-discriminant) / 2 * a;
			System.out.println("A megold�s: x1 = " + x1 + "\tx2 = " + x2);
			}
		
	//	System.out.println(discriminant);
		
	}
}
