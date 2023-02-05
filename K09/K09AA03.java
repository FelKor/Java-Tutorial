

public class K09AA03
{
	public static void main ( String[] args )
	  {
		
		double x;
		double Ergebnis;
		
		System.out.println("Rechnung: 3 * x * x - 8 * x + 4");
		
		x = 4.0;
		Ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Ergebniss bei x= "+x+": "	+	Ergebnis);
		
		x = 2.0;
		Ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Ergebniss bei x= "+x+": "	+	Ergebnis);
		
		x = 2.0/3;
		Ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Ergebniss bei x= "+x+": "	+	Ergebnis);
	  }
}