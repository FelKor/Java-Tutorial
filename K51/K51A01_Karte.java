

abstract class K51A01_Karte {

	String empfaenger;
	String anrede;
	
	public abstract void gruss();
	
	K51A01_Karte(){
	}
	
	K51A01_Karte(String empf, String sex){
		empfaenger = empf;
		anrede = sex;
	}
}
