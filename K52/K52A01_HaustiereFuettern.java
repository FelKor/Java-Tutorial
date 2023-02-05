

public class K52A01_HaustiereFuettern {
	public static void main(String args[]) {
		
		K52A01_Hund Hund1 = new K52A01_Hund("Strolchie", 5, 1);
		K52A01_Katze Katze1 = new K52A01_Katze("Minka", 3, 1);
		
		Katze1.fuettern();
		Katze1.anzeigen();
		System.out.println();
		
		Hund1.fuettern();
		Hund1.anzeigen();
	}

}
