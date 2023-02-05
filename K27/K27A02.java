

import java.awt.*;
import java.util.Scanner;

public class K27A02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Point PointA = new Point();
		Point PointB = new Point();
		int x;
		int y;
		
		System.out.println("Wert x1: ");
		x = scan.nextInt();
		System.out.println("Wert y1: ");
		y = scan.nextInt();
		PointA.move(x, y);
		
		System.out.println("Wert x2: ");
		x = scan.nextInt();
		System.out.println("Wert y2: ");
		y = scan.nextInt();
		PointB.move(x, y);
		
		if(PointA.equals(PointB)) {
			System.out.print("Die Koordinaten der beiden Punkte sind gleich: \n"
								+ PointA.toString() + "Und " + PointB.toString());
			
		}

		scan.close();
	}
}