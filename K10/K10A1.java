

import java.util.Scanner;

class K10A1
{
  public static void main (String[] args)
  {
	  
	  int Radius;
	  Scanner scanner = new Scanner( System.in );
	  
	  System.out.println("Geben Sie den Radius ein: ");
	  Radius = scanner.nextInt();
	  
	  System.out.println("Der Radius ist: " + Radius + " Die Flaeche betraegt:" + (Radius*Radius*Math.PI));
	  
	  scanner.close();
  }
}