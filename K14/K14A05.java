

import java.util.Scanner;

public class K14A05 {
	public static void main(String[]args) {
		
		int vore, voli, hire, hili;
		boolean warnung = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Reifendruck: rechter vorderriefen");
		vore = scan.nextInt();
		if(!(vore<=45 && vore>=35)) {
			System.out.println("Warnung: Der Reifendruck ist auöerhalb des erlaubten Parameters");
			warnung = true;
		}
		
		System.out.println("Reifendruck: linker vorderriefen");
		voli = scan.nextInt();
		if(!(voli<=45 && voli>=35)) {
			System.out.println("Warnung: Der Reifendruck ist auöerhalb des erlaubten Parameters");
			warnung = true;
		}
		
		System.out.println("Reifendruck: rechter hinterriefen");
		hire= scan.nextInt();
		if(!(hire<=45 && hire>=35)) {
			System.out.println("Warnung: Der Reifendruck ist auöerhalb des erlaubten Parameters");
			warnung = true;		
		}
		
		System.out.println("Reifendruck: linker hinterriefen");
		hili = scan.nextInt();
		if(!(hili<=45 && hili>=35)) {
			System.out.println("Warnung: Der Reifendruck ist auöerhalb des erlaubten Parameters");
			warnung = true;
		}
		
		if(!(warnung == true)) {
			if(vore == voli+3 || vore==voli+2 || vore==voli+1 || vore==voli || vore==voli-1 || vore==voli-2 || vore==voli-3) {
				if(hire==hili+3 || hire==hili+2 || hire==hili+1 || hire==hili || hire==hili-1 || hire==hili-2 || hire==hili-3) {
					System.out.println("Der Reifendruck ist in Ordnung");
				}
				else {
					System.out.println("Der Reifendruck ist nicht in Ordnung");
				}
			}
			else {
				System.out.println("Der Reifendruck ist nicht in Ordnung");
			}
		}
		else {
			System.out.println("Der Reifendruck ist nicht in Ordnung");
		}

		scan.close();
	}
}
