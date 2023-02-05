

public class K51A01_Feiertag extends K51A01_Karte {
	
	public K51A01_Feiertag( String e, String sex )
	{
		empfaenger = e;
		anrede = sex;
	}

	  public void gruss() {
		  System.out.println(anrede + " " + empfaenger + ",\n");
		  System.out.println("frohe Feiertage!\n\n");
	  }
}
