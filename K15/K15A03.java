
import java.util.Scanner;

public class K15A03 {
	public static void main(String[]args) {
		
		String wort1, wort2;
		int wert = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie das erste Wort ein: ");
		wort1 = scan.nextLine();
		System.out.println("Geben Sie das zwiete Wort ein: ");
		wort2 = scan.nextLine();
		
		System.out.print(wort1);
		while(wert < 30) {
			System.out.print(".");
			wert = wert + 1;
		}
		System.out.print(wort2);

		scan.close();
	}

}
