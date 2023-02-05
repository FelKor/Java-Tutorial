

import java.util.Scanner;

public class K14A03 {
	public static void main(String[]args) {
		
		int vore, voli, hire, hili;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Reifendruck: rechter vorderriefen");
		vore = scan.nextInt();
		System.out.println("Reifendruck: linker vorderriefen");
		voli = scan.nextInt();
		System.out.println("Reifendruck: rechter hinterriefen");
		hire= scan.nextInt();
		System.out.println("Reifendruck: linker hinterriefen");
		hili = scan.nextInt();
		
		if(vore == voli && hire == hili) {
			System.out.println("Reifendruck ist OK");
		}
		else {
			System.out.println("Reifendruck Pröfen");
		}

		scan.close();
	}
}
