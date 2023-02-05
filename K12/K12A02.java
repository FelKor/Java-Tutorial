
import java.util.Scanner;

public class K12A02 {
	public static void main(String[] args) {
		
		int schrauben, muttern, unterlegscheiben, Gesamtbetrag;
		final int schraubenprs = 5;
		final int mutternprs = 3;
		final int unterlegscheibenprs = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Anzahl Schrauben: ");
		schrauben = scan.nextInt();
		System.out.println("Anzahl Muttern: ");
		muttern = scan.nextInt();
		System.out.println("Anzahl Unterlegscheiben: ");
		unterlegscheiben = scan.nextInt();
		
		if(schrauben>muttern) {
			System.out.println("Kontrollieren Sie Ihre Bestellung");
		}
		else {
			Gesamtbetrag = schrauben*schraubenprs + muttern*mutternprs + unterlegscheiben*unterlegscheibenprs;
			System.out.println("Die Bestellung ist ok und kostet: " + Gesamtbetrag + " Cent");
		
		}

		scan.close();
	}
}
