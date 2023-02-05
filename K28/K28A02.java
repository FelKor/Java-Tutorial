

import java.awt.*;

public class K28A02 {
	public static void main(String[]args) {
		
		Point pt1 = new Point(10,10);
		Point ptAlias = pt1;
		
		if(pt1 == ptAlias) {
			System.out.println("pt1 und ptAlias verweisen auf dasselbe objekt!\n");
		}
		System.out.println("Point pt1 vorher: \t" + pt1);
		System.out.println("Point ptAlias vorher: \t" + ptAlias);
		
		ptAlias.setLocation(ptAlias.x*2, ptAlias.y*2);	
		
		System.out.println("\nNur von ptAlias wurden die x- und y-Werte verdoppelt \n");
		
		System.out.println("Point pt1 nochher: \t" + pt1);
		System.out.println("Point ptAlias nachher: \t" + ptAlias);
		
	
	}

}
