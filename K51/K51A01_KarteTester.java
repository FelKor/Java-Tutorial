

import java.util.Scanner;

public class K51A01_KarteTester {
	public static void main ( String[] args )
	  {
	    String name;
	    String sex = "Liebe/r";
	    String input;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Ihr Name");
	    name = scan.nextLine();
	    System.out.println("Ihr Geschlecht (m/w)");
	    input = scan.nextLine();
	    
	    if(input.equals("m")) {
	    	sex = "Lieber";
	    }
	    else if(input.equals("w")) {
	    	sex = "Liebe";
	    }

	    K51A01_Feiertag feiern = new K51A01_Feiertag( name, sex );
	    feiern.gruss();

	    K51A01_Geburtstag  geb  = new K51A01_Geburtstag( name, 21, sex );
	    geb.gruss();

	    K51A01_Valentin val = new K51A01_Valentin( name, 7, sex );
	    val.gruss();

		scan.close();
	  }

}
