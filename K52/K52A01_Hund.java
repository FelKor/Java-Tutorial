

public class K52A01_Hund extends K52A01_Haustiere{
	
	String kategorie;
	
	K52A01_Hund(String name, double futtervorrat, int x) {
		super(name, futtervorrat);
		
		if(x == 1) {
			kategorie = "Kleinhunde";
		}
		else if(x == 2) {
			kategorie = "Mittelgrosse Hunde";
		}
		else {
			kategorie = "Groaee Hunde";
		}
	}

	public void sprich() {
		System.out.println("Wuff!");
	}
	public void friss() {
		System.out.println(name + ": " + futtervorrat);
		futtervorrat -= 1;
	}
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Kategorie: " + kategorie);
	}
	
}
