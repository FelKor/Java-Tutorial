

import java. util.Scanner;

public class K15A02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int leange;
		int startwert = 0;
		String inputstring;
		
		System.out.println("Geben Sie ein Wort ein: ");
		inputstring = scan.nextLine();
		leange = inputstring.length();
		
		while(startwert < leange) {
			System.out.println(inputstring);
			startwert = startwert + 1;
		}

		scan.close();
	}

}
