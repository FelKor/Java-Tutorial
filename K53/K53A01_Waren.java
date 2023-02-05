

class K53A01_Waren {
	
	private String beschreibung;
	private double preis;
	private int anzahl;
	
	public K53A01_Waren(String beschreibung, double preis, int anzahl) {
		this.beschreibung = beschreibung;
		this.preis = preis;
		this.anzahl = anzahl;
	}
	
	public void anzeigen() {
		System.out.println("Artikel: " + beschreibung + " Preis: " + preis +
				" Anzahl: " + anzahl);
	}
	
	public double getPreis() {
		return preis;
	}
	public void setPreis(double x) {
		this.preis = x;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int x) {
		this.anzahl = x;
	}

}
