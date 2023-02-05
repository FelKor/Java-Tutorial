

import java.util.Scanner;

public class K10A2 
{	
	public static void main (String[] args)
	{
		
		int cent, dollar;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Geben sie die Cent ein: ");
		cent = scan.nextInt();
		
		dollar = cent/100;
		cent = cent%100;
		System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent");
		
		scan.close();
	}
}
