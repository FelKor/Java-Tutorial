

class K09AA01
{
  public static void main ( String[] args )
  {
    
	long arbeitsstunden;
    double stundenlohn;
    double steuersatz;
    
    arbeitsstunden = 40;
    stundenlohn = 10.0;
    steuersatz = 0.10;
    
    System.out.println("Arbeitszeit: " + arbeitsstunden );
    System.out.println("Bruttolohn: " + (arbeitsstunden * stundenlohn) );
    System.out.println("Steuerbetrag: " + (arbeitsstunden * stundenlohn * steuersatz) );
  }
}
