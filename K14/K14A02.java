 import java.util.Scanner;

public class K14A02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int gewicht;
		
		System.out.println("Gewicht: ");
		gewicht = scan.nextInt();
		
		if(gewicht <= 265 && gewicht >= 235) {
			System.out.println("Darf Teilnehmen");
		}
		else {
			System.out.println("Darf nicht Teilnehmen");
		}

		scan.close();
	}

}
