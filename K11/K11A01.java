

import java.util.Scanner;

public class K11A01 {
	public static void main( String[] args) {
		
		double KiloWattStd, KiloWattJahr, Jahreskosten;
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
		KiloWattStd = scan.nextDouble();
			
		System.out.print("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
		KiloWattJahr = scan.nextDouble();
		
		Jahreskosten = (KiloWattJahr*KiloWattStd)/100;
		System.out.println("Jahreskosten: " + Jahreskosten + "ae");
		
		scan.close();
	}	
}
