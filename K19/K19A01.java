

import java.util.Scanner;

public class K19A01 {
	public static void main(String[]args) {
		
		double  betrag, anfangsbetrag, saldo=1000; 
		final double zinssatz=1.5;
		int monat=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den monatlichen Betrag ein");
		anfangsbetrag = scan.nextDouble();
		betrag = anfangsbetrag;
		
		while(saldo >= 0) {
			saldo = saldo-anfangsbetrag+saldo*(zinssatz/100);
			monat = monat+1;
			System.out.println("Monat: " + monat + "\t Saldo: " + saldo + "\t \t Gesamtbetrag: " + betrag);
			betrag = betrag+anfangsbetrag;
			
		}

		scan.close();
	}
}
