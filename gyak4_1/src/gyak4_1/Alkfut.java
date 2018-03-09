package gyak4_1;

public class Alkfut {
	
	public static void main(String[] args) {
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(43);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(20);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(30);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(67);
		
		for(Alkalmazott a : alkok)
			System.out.println(a.szovegVissza());
		
		int max = alkok[0].getPayment();
		for(int i = 0; i < alkok.length; i++) {
			if(alkok[i].getPayment() > max)
				max = alkok[i].getPayment();
		}
		
		for(int i = 0; i < alkok.length; i++) {
			if(alkok[i].getPayment() == max)
				System.out.println("A legmagasabb fizetesu alkalmazott: " + alkok[i].szovegVissza());
		}
		
		int db = 0;
		for(int i = 0; i < alkok.length; i++) {
			if(alkok[i].fizHatar(20, 50))
				db++;
		}
		System.out.println(db + " darab fizetes esik az intervallumba.");
		
	/*	
		
		Alkalmazott alk1 = new Alkalmazott();
		
		alk1.setName("Tomi");
		alk1.setPayment(8);
		
		
		
		System.out.println(alk1.szovegVissza());
		
		alk1.fizNov(1);
		System.out.println(alk1.szovegVissza());
		
		
		boolean isTrue = alk1.fizHatar(10, 20);
		if(isTrue)
			System.out.println("A megadott hatarok koze esik a fizetese.");
		else
			System.out.println("Nem esik a megadott hatarok koze a fizetese.");
		
		System.out.println("Az ado erteke: " + alk1.getTax());
		
	
	
	Alkalmazott alk2 = new Alkalmazott();
	
		alk2.setName("Tomi2");
		alk2.setPayment(80);
	
		if(alk1.isGreater.alk2) 
			System.out.println("Az alk1 fizetese nagyobb");
			else
				System.out.println("Az alk2 fizetese nagyobb"); */
		
}
	
}
