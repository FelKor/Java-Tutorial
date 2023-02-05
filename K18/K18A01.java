
import java.util.Scanner;

public class K18A01 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		double anfangsstand, endstand, gallon, mpgallon;
		boolean schleife = true;
		
		
		while(schleife) {
			System.out.println("Anfangsstand Meilen: ");
			anfangsstand = scan.nextInt();
			
			if(anfangsstand>=0) {
				System.out.println("Endstand Meilen: ");
				endstand = scan.nextInt();
				System.out.println("Gallon: ");
				gallon = scan.nextInt();
				mpgallon = (endstand-anfangsstand)/gallon;
				System.out.println("Meilen pro Gallon: " + mpgallon);
				System.out.println(" ");
			}
			else {
				System.out.println("bye");
				schleife = false;
			}
		}

		scan.close();
	}
}
