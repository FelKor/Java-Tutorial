
import java.util.Scanner;

public class K11A02 {
	public static void main(String[] args) {
		
		double e, z;
		final double G = 9.81;
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
		z = scan.nextDouble();
		
		e = (1.0/2)*G*z*z;
		System.out.println("Die Entfernung betraegt: " + e + " Meter");

		scan.close();
	}
}
