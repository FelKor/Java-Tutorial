

import java.util.Scanner;

public class K17A02 {
	public static void main(String[]args) {
		
		double x, summex = 1;
		int n, inkrement = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie x ein: ");
		x = scan.nextDouble();
		System.out.println("Geben Sie n ein: ");
		n = scan.nextInt();
		
		if(n>=0) {
			while(inkrement<n) {
				summex = summex*x;
				inkrement = inkrement + 1;
			}
			System.out.println(x + " hoch " + n + " ergibt:  " + summex);
		}
		else {
			System.out.println("n muss ein positiver Integer sein");
		}

		scan.close();		
	}
}
