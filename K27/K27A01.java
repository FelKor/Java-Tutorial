

import java.awt.*;
import java.util.Scanner;

public class K27A01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Point nummer1 = new Point();
		Point nummer2 = new Point();
		int x;
		int y;
		
		System.out.println("Wert x1: ");
		x = scan.nextInt();
		System.out.println("Wert y1: ");
		y = scan.nextInt();
		nummer1.move(x, y);
		
		System.out.println("Wert x2: ");
		x = scan.nextInt();
		System.out.println("Wert y2: ");
		y = scan.nextInt();
		nummer2.move(x, y);
		
		System.out.println(nummer1.toString());
		System.out.println(nummer2.toString());

		scan.close();
	}
}
