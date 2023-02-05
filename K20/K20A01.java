

import java.util.Random;
import java.util.Scanner;

public class K20A01 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int versuch=1, computerwurf, spielerrat;
		boolean richtig=false;
		
		System.out.println("Ich denke an eine Zahl von 1 bis 10.\n" + "Sie haben 3 versuch diese zahl zu erraten.\n" + "Raten Sie!");
		computerwurf = rand.nextInt(9)+1;
		
		while(versuch<=3 && richtig==false) {
			System.out.println("Versuch:" + versuch);
			versuch += 1;
			spielerrat = scan.nextInt();
			
			if(spielerrat==computerwurf) {
				System.out.println("Richtig");
				richtig = true;
			}
			else {
				System.out.println("Falsch");
			}
		}
		if(richtig==true) {
			System.out.println("Sie haben das Spiel gewonnen!");
		}
		else {
			System.out.println("Die richtige Zahl war: " + computerwurf + "\nSie haben das Spiel verloren.");
		}

		scan.close();
	}
}