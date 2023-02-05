
public class K19A02 {
	public static void main(String[]args) {
		
		int monat=0; 
		double wirkstoffgehalt=100;
		final double zinssatz=4;
		
		System.out.println("Monat: \t" + monat + "\t Wirkstoffgehalt: \t" + wirkstoffgehalt);
		while(wirkstoffgehalt >=50) {
			wirkstoffgehalt = wirkstoffgehalt-wirkstoffgehalt*(zinssatz/100);
			monat = monat+1;
			System.out.println("Monat: \t" + monat + "\t Wirkstoffgehalt: \t" + wirkstoffgehalt);
		}
		System.out.print("Abgelaufen");
	}
}