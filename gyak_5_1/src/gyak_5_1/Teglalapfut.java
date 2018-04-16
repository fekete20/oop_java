package gyak_5_1;

public class Teglalapfut {
	public static void main(String[] args) {
		Teglalap a = new Teglalap(2, 5);
		Teglalap b = new Teglalap(3, 6);
		Teglalap c = a;
		
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		
		a.setOldalak(4, 10);
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		
		a.setOldalak(3, 7);
		System.out.println("Az a == b erteke: " + (a == b));
		System.out.println("Az a == c erteke: " + (a == c));
		
		System.out.println("");
		System.out.println("Az a == b metodussal: " + (a.getOldalakEgyeznekE(a)));
		
		
	}
}
