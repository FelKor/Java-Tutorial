
import java.util.Scanner;

public class K16A02 {
	public static void main(String[]args) {
		
		int n;
		double summe = 0;
		int inkrement = 1;
		final double zahl = 1.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie n ein: ");
		n = scan.nextInt();
		
		while(inkrement < n) {
			summe = summe+zahl/inkrement;
			inkrement = inkrement + 1;
		}
		System.out.println("Die Summe ist: " + summe);

		scan.close();
	}

}
