
import java.util.Scanner;

public class K14A01 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int girokonto, sparkonto;
		
		System.out.println("Guthaben Ihres Girokontos: ");
		girokonto = scan.nextInt();
		
		System.out.println("Guthaben Ihres Sparkontos");
		sparkonto = scan.nextInt();
		
		if(girokonto>=1000 || sparkonto>=1500) {
			System.out.println("Es wird keine Scheckgeböhr erhoben");
		}
		else {
			System.out.println("Es wird eine Scheckgeböhr von 0.15$ erhoben");
		}

		scan.close();
	}
}
