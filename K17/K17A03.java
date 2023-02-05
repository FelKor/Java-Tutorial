

import java.util.Scanner;

public class K17A03 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int stern = 0, anzahlsterne, zeile = 0;
		
		System.out.println("Anfangszahl der Sterne: ");
		anzahlsterne = scan.nextInt();
		
		while(zeile <= anzahlsterne) {
			while(stern < anzahlsterne) {
				System.out.print("*");
				stern = stern+1;
			}
			System.out.println("");
			stern = 0;
			anzahlsterne = anzahlsterne-1;
		}

		scan.close();		
	}
}
