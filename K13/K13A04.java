
import java.util.Scanner;

public class K13A04 {
	public static void main(String[]args) {
		
		String name = new String();
		Scanner scan = new Scanner(System.in);
		int stearke, gesundheit, glueck;
		
		System.out.print("Willkommen zu copy's schatzsuche, Geben Sie den Namne der spielfigut ein:");
		name = scan.nextLine();
		
		System.out.println("Staerke eingeben (1-10)");
		stearke = scan.nextInt();
		System.out.println("Gesundheit eingeben (1-10)");
		gesundheit = scan.nextInt();
		System.out.println("Glueck eingeben (1-10)");
		glueck = scan.nextInt();
		
		if(stearke+gesundheit+glueck > 15) {
			stearke = 5;
			gesundheit = 5;
			glueck = 5;
			
			System.out.println("Sie haben zu viele Punkte eingegeben!");
		}
		System.out.println("Ihr Charackter: " + name + 
				", Staerke: " + stearke + 
				", Gesundheit:  " + gesundheit + 
				", Glueck: " + glueck);
		
		scan.close();
	}
}
