
import java.util.Scanner;

public class K13A03 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int posten;
		
		System.out.println("Anzahl von Posten: ");
		posten = scan.nextInt();
		
		if(posten==1) {
			System.out.println("Normale Erhitzungszeit");
		}
		if(posten==2) {
			System.out.println("50% mehr Herhitzungszeit");
		}
		if(posten==3) {
			System.out.println("Erhitzungszeit verdoppeltn");
		}
		if(posten>3) {
			System.out.println("Nicht Erhitzen");
		}

		scan.close();
	}

}
