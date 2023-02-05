
import java.util.Scanner;

public class K12A05 {
	public static void main(String[]Args) {
		
		int gebJahr, aktJahr, gesAlter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geburtsjahr: ");
		gebJahr = scan.nextInt();
		System.out.println("Aktuelles Jahr: ");
		aktJahr = scan.nextInt();
		
		if ( aktJahr >= gebJahr) {
			gesAlter = aktJahr-gebJahr;
			System.out.println("Ihr Alter ist: " + gesAlter);
		}
		else {
			gesAlter = (2000+aktJahr)-(1900+gebJahr);
			System.out.println("Ihr Alter ist: " + gesAlter);
		}
		
		scan.close();
	}
}