
import java.util.Scanner;

public class K13A01 {
	public static void main(String[]args) {
		
		String Artikel = new String();
		Scanner scan = new Scanner(System.in);
		final double versandkostu = 2;
		final double versandkosten = 3;
		final double express = 5;
		double expressvers, Preisartk, versand, Gesamt;
		
		System.out.println("Geben sie den Artikel ein: ");
		Artikel = scan.nextLine();
		System.out.println("Geben sie den Preis ein: ");
		Preisartk = scan.nextDouble();
		System.out.println("Expressversand (0 = nein, 1 = ja");
		expressvers = scan.nextDouble();
		
		if(Preisartk<=10) {
			versand = versandkostu;
		}
			else {
				versand = versandkosten;
			}
		if(expressvers==1) {
			versand += express;
		}
		
		Gesamt = versand+Preisartk;
		
		System.out.println("Rechnung");
		System.out.println(Artikel + ": " + Preisartk);
		System.out.println("Versand: " + versand);
		System.out.println("Gesamt: " + Gesamt);

		scan.close();
	}
}
