

public class Beispiel2 {
	
	public static void main ( String[] args )
	  {
	    
		long   arbeitsstunden = 40;
	    double stundenlohn = 10.0, steuersatz = 0.1;
	    double steuerbetrag; // double da es eine Kommazahl ist

	    System.out.println("gearbeitete Stunden: " + arbeitsstunden );
	    System.out.println("Bruttolohn: " + (arbeitsstunden * stundenlohn) );
	    
	    steuerbetrag = (arbeitsstunden * stundenlohn * steuersatz);
	    
	    System.out.println("Steuerbetrag: " + steuerbetrag );
	  }
}
