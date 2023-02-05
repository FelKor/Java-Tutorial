
import java.util.Scanner;

public class K12A01 {
	public static void main(String[] args) {
		
		int Gesamtbetrag, Discountpreis;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Geben Sie den Gesamtbetrag ein: ");
		Gesamtbetrag = scan.nextInt();
		
		if (Gesamtbetrag < 10) {
			System.out.println("Preis: " + Gesamtbetrag);
		}
		else {
			Discountpreis = Gesamtbetrag-Gesamtbetrag*10/100;
			System.out.println("Discountpreis: " + Discountpreis);
		}	
		
		scan.close();
	}
}
