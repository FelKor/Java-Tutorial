

import java.awt.*;

public class K28A01 {
	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 10);
		Point pt2 = new Point(30, 30);
		int hoehe;
		int breite;
		
		hoehe = (int)pt2.getY()-(int)pt1.getY();
		breite = (int)pt2.getX()-(int)pt1.getX();
		
		System.out.println("Die Flaeche betraegt: " + hoehe*breite);
	}

}
