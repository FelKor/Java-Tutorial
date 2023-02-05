
import java.util.Scanner;

public class K13A02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		final int tDampfmin = 373;
		int tLuft, tDampf;
		double Effizienz;
		
		System.out.println("Geben Sie die Lufttemperatur ein: ");
		tLuft = scan.nextInt();
		System.out.println("Geben Sie die Dampftemperatur ein: ");
		tDampf = scan.nextInt();
		
		if(tDampf>=tDampfmin) {
			Effizienz = 1 - tLuft/tDampf;
		}
		else {
			Effizienz = 0;
		}
		
		System.out.println("Die Effizienz betrögt: " + Effizienz);

		scan.close();
	}

}
