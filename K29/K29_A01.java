

import java.util.Scanner;

public class K29_A01 {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String eingabe;
		
		System.out.println("Geben Sie ein String ein: ");
		eingabe = scan.nextLine();
		
		for(int i=0; i<eingabe.length(); i++) {
			System.out.println(eingabe.charAt(i));
		}

		scan.close();
	}

}
