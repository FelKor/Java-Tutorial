

import java.util.Scanner;

public class K18A04 {
	public static void main(String[]args) {
		
		int x1, x2, y1, y2, breite, hoehe, floeche;
		Scanner scan = new Scanner(System.in);
		boolean schleife = true;
		
		while(schleife == true) {
			System.out.println("Erster Eckpunkt x-Koordinate: ");
			x1 = scan.nextInt();
			System.out.println("Erster Eckpunkt y-Koordinate: ");
			y1 = scan.nextInt();
			System.out.println("Zweiter Eckpunkt x-Koordinate: ");
			x2 = scan.nextInt();
			System.out.println("Zweiter Eckpunkt y-Koordinate: ");
			y2 = scan.nextInt();
			
			breite = x2-x1;
			hoehe = y2-y1;
			floeche = hoehe*breite;
			
			if(breite < 0) {
				breite = breite*(-1);
			}
			if(hoehe < 0) {
				hoehe = hoehe*(-1);
			}
			if(floeche < 0) {
				floeche = floeche*(-1);
			}
			
			System.out.println("Breite: " + breite + "	Hoehe: " + hoehe + "	Floeche: " + floeche);
			System.out.println("");
			
			if(breite==0 || hoehe==0) {
				schleife = false;
			}
		}
		scan.close();
	}
}
