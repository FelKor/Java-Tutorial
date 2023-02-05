
import java.util.Scanner;

public class K12A03 {
	public static void main(String[]args) {
		
		int Tankkapazitaet, Benzinanzeige, MeilenProGallon;
		double Meilen;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tankkapazitaet in Gallon: ");
		Tankkapazitaet = scan.nextInt();
		System.out.println("Benzinanzeige in Prozent: ");
		Benzinanzeige = scan.nextInt();
		System.out.println("Meilen pro Gallon:");
		MeilenProGallon = scan.nextInt();
		
		Meilen = Tankkapazitaet * (Benzinanzeige/100.0) * MeilenProGallon;
		if(Meilen >= 200) {
			System.out.println("Weiterfahren...");
		}
		else {
			System.out.println("Tanken!");
		
		}

		scan.close();
	}
}
