

public class K52A01_Katze extends K52A01_Haustiere{
	
	String haltung; 
	
	K52A01_Katze(String name, double futtervorrat, int x){
		super(name, futtervorrat);

		if(x == 1) {
			haltung = "Wohnung";
		}
		else {
			haltung = "Artgerecht";
		}
	}
	
	public void sprich() {
		System.out.println("Miau!");
	}
	public void friss() {
		System.out.println(name + ": " + futtervorrat);
		futtervorrat -= 0.5;
	}
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Haltung: " + haltung);
	}

}
