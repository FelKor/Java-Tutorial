
import java.util.Scanner;

public class K16A01 {
	public static void main(String[]args) {
		
	int anzahl, zahl; 
	int zahlges = 0;
	int inkrement = 0;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Wie viele Integer sollen addiert werden: ");
	anzahl = scan.nextInt();
	
	while (inkrement < anzahl) {
		System.out.println("Geben Sie einen Integer ein: ");
		zahl = scan.nextInt();
		zahlges = zahlges + zahl;
		inkrement = inkrement + 1;
	}
	System.out.println("Die Summe ist " + zahlges);

	scan.close();
	}
}
