

public class K17A04 {
	public static void main(String[]args) {
		
		int lehr=7, stern=1, lehranzahl=1, sternanzahl=1, reihe=1;
		
		while(reihe<=8) {
		
			while(lehranzahl<=lehr) {
				System.out.print(" ");
				lehranzahl++;
			}			
			while(sternanzahl<=stern) {
				System.out.print("*");
				sternanzahl++;
			}
			System.out.println(" ");
			stern += 2;
			sternanzahl = 1;
			lehranzahl = 1;
			lehr--;
			reihe++;
		}
		
		reihe = 1;
		lehr = 6;
		stern = 3;
		
		while(reihe<=3) {
			while(lehranzahl<=lehr) {
				System.out.print(" ");
				lehranzahl++;
			}
			while(sternanzahl<=stern) {
				System.out.print("*");
				sternanzahl++;
			}
			
			System.out.println(" ");		
			sternanzahl = 1;
			lehranzahl = 1;
			reihe++;
		}
	}
}
