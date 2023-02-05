

public class K51A01_Geburtstag extends K51A01_Karte{
	
	int alter;
	
	public K51A01_Geburtstag ( String e, int jahre, String sex ) {
		empfaenger = e;
		anrede = sex;
		alter = jahre;
	}
	public void gruss() {
		System.out.println(anrede + " " + empfaenger + ",\n");
		System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
	}
}
