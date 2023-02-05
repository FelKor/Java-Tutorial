

import java.util.Scanner;

public class K18A03 {
	public static void main(String[]args) {
		
		double gewicht, versandkosten=0;
		Scanner scan = new Scanner(System.in);
		boolean schleife = true;
		
		while(schleife == true) {
			System.out.println("Gewicht der Sendung: ");
			gewicht = scan.nextInt();
			
			if(gewicht<=0) {
				schleife = false;
				System.out.println("bye");
			}
			else if(gewicht<=10) {
					versandkosten = 3;
			}
			else {
				versandkosten = 3+(gewicht-10)*0.25;
			}
			System.out.println("Versandkosten: " + versandkosten);
			System.out.println(" ");
		}

		scan.close();
	}
}
