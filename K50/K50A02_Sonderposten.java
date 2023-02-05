

public class K50A02_Sonderposten extends K50A01_Artikel {
	
	double rabatt = 0.1;
	double neuverkaufspreis;

	public K50A02_Sonderposten(String artNr, String bez, double prs, int z) {
		super(artNr, bez, prs, z);
		
		if(z>12) {
			rabatt = 0.3;
		}
	}
	
	public void anzeigen() {
		System.out.println("Sonderposten: ");
		super.anzeigen();
		System.out.println("(VK <neu>: " + neuverkaufspreis + " Euro, Rabatt: " + (rabatt*100) + "%)");
	}
	
	public double berechneVerkaufspreis() {
		super.berechneVerkaufspreis();
		neuverkaufspreis = verkaufspreis-(verkaufspreis*rabatt);
		return neuverkaufspreis;
	}

}
