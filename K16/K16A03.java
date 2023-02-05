
import java.util.Scanner;

public class K16A03 {
	public static void main(String[]args) {
		
		int n;
		int inkrement = 0;
		double x, durchschnitt, durchschnitt2, durchschnittQ, summex = 0, summexi = 0, sd;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie an wie viele Zahlen folgen: ");
		n = scan.nextInt();
		
		while(inkrement < n) {
			System.out.println("geben Sie ihre Zahl ein: ");
			x = scan.nextDouble();
			summex = summex + x;
			summexi = summexi+x*x;
			inkrement = inkrement+1;
		}
		durchschnitt = summex/n;
		durchschnitt2 = durchschnitt*durchschnitt;
		durchschnittQ = summexi/n;
		sd = Math.sqrt(durchschnittQ-durchschnitt2);
		System.out.print("Die Standardabweichung lautet: " + sd);

		scan.close();
		
	}
}
