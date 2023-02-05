

import java.util.Scanner;

public class K18A02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int obergrenze, untergrenze,summe=0,summea=0, zahl=1;
		boolean schleife = true;
		
		System.out.println("Untergrenze des Bereichs: ");
		untergrenze = scan.nextInt();
		System.out.println("Obergrenze des Bereichs: ");
		obergrenze = scan.nextInt();
		
		while(schleife) {
			if(!(zahl==0)) {
				System.out.println("Daten eingeben: ");
				zahl = scan.nextInt();
				
				if(zahl>=untergrenze && zahl<=obergrenze) {
					summe += zahl;
				}
				else {
					summea += zahl;
				}
				
			}
			else {
				schleife = false;
			}
		}
		System.out.println("Summe der Werte innerhalb des Bereichs: " + summe);
		System.out.println("Summe der Werte auoeerhalb des Bereichs: " + summea);

		scan.close();
	}
}
