

import java.util.Scanner;

public class K29_A03 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String eingabe, substringnachname, vorname, nachname;
		int indexnachname;
		
		System.out.println("Geben Sie Ihren Namen ein: ");
		eingabe = scan.nextLine();
		
		indexnachname = eingabe.indexOf(" ");
		substringnachname = eingabe.substring(indexnachname);
		nachname = substringnachname.toUpperCase();
		vorname = eingabe.substring(0, indexnachname);
		
		System.out.println(vorname + nachname);

		scan.close();
	}

}
