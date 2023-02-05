
public class K53A01_TestKlasse {
	public static void main(String[] args) {
		
		K53A01_Waren waren = new K53A01_Waren("Tube", 1.40, 2);
		K53A01_Lebensmittel lebensmittel = new K53A01_Lebensmittel("Milch", 0.95, 1, 690);
		K53A01_Spielwaren spiel = new K53A01_Spielwaren("Lego", 300, 1, 12);
		K53A01_Buecher buch = new K53A01_Buecher("Life of Lutz", 15, 17, "Luzi");
		
		waren.anzeigen();
		System.out.println();

		lebensmittel.anzeigen();
		System.out.println();
		
		spiel.anzeigen();
		System.out.println("Die Steuer betraegt: " + spiel.berechneSteuer());
		System.out.println();
		
		buch.anzeigen();
		System.out.println("Die Steuerbetraegt: " + buch.berechneSteuer());
	}

}
