
import java.util.Scanner;

public class K11A04 {
	public static void main( String[] args) {
		
		double x, ZweierLogarithmus;
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Geben Sie ein double ein: ");
		x = scan.nextDouble();
		
		ZweierLogarithmus = Math.log(x) / Math.log(2);
		System.out.print("Der Zweierlogarithmus von " + x + " ist " + ZweierLogarithmus);
		
		scan.close();
	}
}