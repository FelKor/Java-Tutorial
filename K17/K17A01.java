
import java.util.Scanner;

public class K17A01 {
	public static void main(String[]args) {
		
		int n, inkrement  = 0, Quadratsumme=0, Kubiksumme=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie ein n ein: ");
		n = scan.nextInt();
		
		while(inkrement<=n) {
			Quadratsumme = Quadratsumme + inkrement*inkrement;
			Kubiksumme = Kubiksumme + inkrement*inkrement*inkrement;
			inkrement = inkrement + 1;
		}
		System.out.println("Die Quadratsumme ist: " + Quadratsumme);
		System.out.println("Die Kubiksumme ist: " + Kubiksumme);

		scan.close();		
	}
}
