

class K53A01_Spielwaren extends K53A01_Waren implements K53A01_Besteuerbar{
	
	private int mindestalter;
	
	K53A01_Spielwaren(String beschreibung, double preis, int anzahl, int mindestalter){
		
		super(beschreibung, preis, anzahl);
		this.mindestalter = mindestalter;
	}
	
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Mindestalter: " + mindestalter);
	}
	
	public double berechneSteuer() {
		return super.getPreis()*STEUERSATZ;
	}
	
	public int getMindestaler() {
		return this.mindestalter;
	}
	public void setMindestalert(int x) {
		this.mindestalter = x;
	}

}
