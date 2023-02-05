
public class K50A01_Artikel {
	
	String artikelNr;
	String bezeichnung;
	double einkaufspreis;
	int lagerzeit;
	double verkaufspreis = 0;
	final double handelsspanne = 0.6;
	final double mwst = 0.19;
	
	public K50A01_Artikel(String artNr, String bez, double prs, int z) {
		artikelNr = artNr;
		bezeichnung = bez;
		einkaufspreis = prs;
		lagerzeit = z;
	}
	
	
	public void anzeigen() {
		System.out.println("Artikel Nummer: " + artikelNr + "\t Bezeichnung: " + bezeichnung 
				+ "\t Einkaufspreis: " + einkaufspreis + "\t lagerzeit: " + lagerzeit + 
				"\t Verkaufspreis: " + verkaufspreis);
	}
	
	public double berechneVerkaufspreis() {
		verkaufspreis = (einkaufspreis+einkaufspreis*handelsspanne)*(1+mwst);
		return verkaufspreis;
	}

}
