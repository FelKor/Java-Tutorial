
import java.util.Scanner;

public class K12A04 {
	public static void main(String[]args) {
		
		double PrsPackungA, PrsPackungB, PrztMageresFleischA, PrztMageresFleischB, PreisA, PreisB;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preis pro Pfund Packung A: ");
		PrsPackungA = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung A: ");
		PrztMageresFleischA = scan.nextDouble();
		System.out.println("Preis pro Pfund Packung B: ");
		PrsPackungB = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung B: ");
		PrztMageresFleischB = scan.nextDouble();
		
		PreisA = PrsPackungA/(PrztMageresFleischA/100);
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + PreisA);
		
		PreisB = PrsPackungB/(PrztMageresFleischB/100);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + PreisB);
		
		if(PreisA>PreisB) {
			System.out.println("Packung B ist Preiswerter");
		}
		else {
			System.out.println("Packung A ist Preiswerter");
		}

		scan.close();
	}
}
