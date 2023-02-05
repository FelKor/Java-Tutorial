

import java.util.Scanner;

public class K14A04 {
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
		
			if(vore == voli && hire == hili && !(warnung == true)) {
				System.out.println("Der Reifendruck ist in Ordnugn");
			}
		else {
			System.out.println("Der Reifendruck ist nicht in Ordnung");
		}

		scan.close();
	}
}
