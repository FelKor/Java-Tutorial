
import java.util.Scanner;

public class K11A03 {
	public static void main( String[] args) {
		
		double HM, AM, x, y;
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Geben Sie x ein: ");
		x = scan.nextDouble();
		
		System.out.print("Geben Sie y ein: ");
		y = scan.nextDouble();
		
		AM = (x + y) /2;
		HM = 2/ ( 1/x + 1/y);
		
		System.out.println("Arithmetisches Mittel: " + AM);
		System.out.println("Harmonisches Mittel: " + HM);
		
		scan.close();
	}
}
