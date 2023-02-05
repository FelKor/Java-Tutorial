

public class K50A01_ArtikelTester {
	public static void main(String args[]) {
		
		K50A01_Artikel A = new K50A01_Artikel("SC123-F", "Duffy", 10, 3);
		K50A02_Sonderposten B = new K50A02_Sonderposten("SC347_A", "Glen", 49, 15);
		
		A.berechneVerkaufspreis();
		B.berechneVerkaufspreis();
		A.anzeigen();
		System.out.println();
		B.anzeigen();
	}

}
