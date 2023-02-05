

public class K47aA05 {
	public static void main(String[]args) {
		
		double[] arr = {5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};
		int anzahltest = arr.length;
		double[] entfernung = new double[anzahltest];
		double gesamt = 0;
		double maxentfernung = 0;
		double durchschnitt;
		double neuerdurchschnitt;
		
		for(int i=0; i<anzahltest; i++) {
			gesamt += arr[i];
			System.out.println("array["+i+"]"+arr[i]);
		}
		durchschnitt = gesamt/anzahltest;
		System.out.println("Durchschnitt: " + durchschnitt);
		gesamt = 0;
		
		for(int i=0; i<anzahltest; i++) {
			entfernung[i] = durchschnitt-arr[i];
			if(entfernung[i]<0) {
				entfernung[i] = entfernung[i]*(-1);
			}
			if(entfernung[i]>maxentfernung) {
				maxentfernung = entfernung[i];
			}
		}
		for(int i=0; i<anzahltest; i++) {
			if(entfernung[i]==maxentfernung) {
				System.out.println("Entferntester Wert: " + arr[i]);
				arr[i] = 0;
				anzahltest--;
			}
		}
		for(int i=0; i<arr.length; i++) {
			gesamt+=arr[i];
		}
		neuerdurchschnitt = gesamt/anzahltest;
		System.out.println("Neuer Durchschnitt: " + neuerdurchschnitt);
	}
}
