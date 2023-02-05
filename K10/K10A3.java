

import java.util.Scanner;

public class K10A3 
{	
	public static void main (String[] args) 
	{
		
		int inData, dollar, quarter, dime, nickle, cent;
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Geben sie die Cent ein: ");
		inData = scan.nextInt();
		
		dollar = inData/100;
		quarter = inData%100/25;
		dime = inData%100%25/10;
		nickle = inData%100%25%10/5;
		cent = inData%100%25%10%5;
		
		System.out.println(	"Das Wechselgeld ist "
							+ dollar + " Dollar, "
							+ quarter + " Quarter, "
							+ dime + " Dime, "
							+ nickle + " Nickle und " 
							+ cent + " Cent."
							);
		
		scan.close();
	}
}
