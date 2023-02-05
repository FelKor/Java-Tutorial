

import java.util.Scanner;

public class K29_A02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String eingabe;
		boolean run = true;
		
		while(run) {
			String anrede = "";
			
			System.out.println("Geben Sie einen Namen ein: ");
			eingabe = scan.nextLine();
			
			
			if(eingabe.trim().toLowerCase().startsWith("amy") || 
					eingabe.trim().toLowerCase().startsWith("buffy") ||
					eingabe.trim().toLowerCase().startsWith("cathy")) {
				anrede = "Ms. ";
			}
			else if(eingabe.trim().toLowerCase().startsWith("elroy") ||
					eingabe.trim().toLowerCase().startsWith("fred") ||
					eingabe.trim().toLowerCase().startsWith("graham")) {
				anrede = "Mr. ";
			}
			else if(eingabe == "") {
				run = false;
			}
			
			System.out.println(anrede + eingabe);
		}

		scan.close();
	}

}
