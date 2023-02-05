

public class K53A01_Buecher extends K53A01_Waren implements K53A01_Besteuerbar {
	
	private String autor;
	
	K53A01_Buecher(String beschreiben, double preis, int anzahl, String autor){
		super(beschreiben, preis, anzahl);
		this.autor = autor;
	}
	
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Autor: " + autor);
	}
	
	public double berechneSteuer() {
		return super.getPreis()*STEUERSATZ;
	}
	
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String x) {
		this.autor = x;
	}
}
