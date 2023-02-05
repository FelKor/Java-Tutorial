

abstract class K51A02_Haustiere {
	
	String name;
	double futtervorrat;
	int anzahlTage;
	
	K51A02_Haustiere(String name, double futtervorrat){
		this.name = name;
		this.futtervorrat = futtervorrat;
	}
	
	public void fuettern() {
		sprich();
		while(futtervorrat > 0) {
			friss();
			anzahlTage += 1;
		}
	}
	
	public void anzeigen() {
		System.out.println("Name des Tieres: " + name);
		System.out.println("Tage die der Futtervorrat reicht: " + anzahlTage);
	}
	
	public abstract void friss();
	public abstract void sprich();

}
