

public class K47aA01 {
	public static void main(String[] args) {
		
		int[] array = {2, 3, 5, 7, 9, 12, 97, 24, 54};
		int summegerade = 0;
		int summeungerade = 0;
		int summeges = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 0) {
				summeges += array[i];
				if(array[i]%2==0) {
					summegerade += array[i];
				}
				else {
					summeungerade += array[i];
				}
			}
		}
		System.out.println("Summe Gesamt: " + summeges);
		System.out.println("Summe Gerade: " + summegerade);
		System.out.println("Summe Ungerade: " + summeungerade);
	}
}
