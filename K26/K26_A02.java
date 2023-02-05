

import java.util.Scanner;

public class K26_A02 {
	public static void main(String[]args) {
		
		int summe = 0;
		String check = "ja";
		String eingabe;
		boolean eingabeaufforderung = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Eingabeaufforderung <ja> oder <nein>? ");
		eingabe = scan.nextLine();
		
		if(eingabe.equals(check)) {
			eingabeaufforderung = true;
		}
		
		for(int i=0; i<5; i++) {
			if(eingabeaufforderung) {
				System.out.println("Geben Sie " + (i+1) + ". Zahl ein:");
			}
			summe += scan.nextInt();
		}
		System.out.println("Gesamtsumme " + summe);

		scan.close();
	}
}
