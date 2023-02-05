

import java.util.Scanner;

public class K10A4 
{	
	public static void main (String[] args) 
	{
		
		double U, R, I;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ihre Spannung: ");
		U = scan.nextDouble();
		System.out.println("Ihr Widerstand: ");
		R = scan.nextDouble();
		
		I = U/R;
		
		System.out.println("Ihre Stromstaerke Lautet: " + I + " Ampere");

		scan.close();
	}
}