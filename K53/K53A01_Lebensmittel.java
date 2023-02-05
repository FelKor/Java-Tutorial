

class K53A01_Lebensmittel extends K53A01_Waren{
	
	private double kalorien;
	
	K53A01_Lebensmittel(String beschreibung, double preis, int anzahl, double kalorien){
		super(beschreibung, preis, anzahl);
		this.kalorien = kalorien;
	}
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Kalorien: " + kalorien);
	}
	
	public double getKalorien() {
		return this.kalorien;
	}
	public void setKalorien(double x) {
		this.kalorien = x;
	}

}
