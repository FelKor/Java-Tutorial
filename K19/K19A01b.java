

import java.util.Scanner;

public class K19A01b {
	public static void main(String[]args) {
		
		double  betrag, anfangsbetrag, saldo, zinssatz;
		int monat=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den Anfangssaldo ein: ");
		saldo = scan.nextDouble();
		System.out.println("Geben Sie den monatlichen Betrag ein");
		anfangsbetrag = scan.nextDouble();
		betrag = anfangsbetrag;
		System.out.println("Geben Sie den monatlichen Zinssatz ein");
		zinssatz = scan.nextDouble();
		
		while(saldo >= 0) {
			saldo = saldo-anfangsbetrag+saldo*(zinssatz/100);
			monat = monat+1;
			System.out.println("Monat: " + monat + "\t Saldo: " + saldo + "\t \t Gesamtbetrag: " + betrag);
			betrag = betrag+anfangsbetrag;
			if(saldo<=anfangsbetrag) {
				
			}
			
		}
		scan.close();
	}
}