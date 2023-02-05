

public class K26_A01 {
	public static void main(String[]args) {
		
		String str1, str2, str3, str4;
		int obj=0;
		
		str1 = "Bo, die Katze";
		str2 = "Bo, die Katze";
		str3 = new String("Fred, der HUnd");
		str4 = new String("Fred, der Hund");
		
		if(str1 == str2 && str1.equals(str2)) {
			obj++;
		} else {
			obj+=2;
		}
		if(str3 == str4 && str3.equals(str4)) {
			obj++;
		}
		else {
			obj+=2;
		}
		
		System.out.println("Es wurden " + obj + " erzeugt.");
	}

}
