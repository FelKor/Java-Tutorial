
public class K51A01_Valentin extends K51A01_Karte{
	
	int kuesse;

	  public K51A01_Valentin ( String e, int k, String sex )
	  {
	    empfaenger = e;
	    anrede = sex;
	    kuesse     = k;
	  }

	  public void gruss()
	  {
	    System.out.println(anrede + " " + empfaenger + ",\n");
	    System.out.println("herzliche Gruesse und Kuesse,\n");
	    for ( int j = 0; j < kuesse; j++ )
	      System.out.print("X");
	    System.out.println("\n\n");
	  }
}
