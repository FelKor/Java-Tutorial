

public class K46aA03 {
	public static void main(String[]args) {
		
		int[] arrA   = { 13, -22,  82,  17};
		int[] arrB   = {-12,  24, -79, -13};
		int[] summe    = {  0,   0,   0,   0};
		
		for(int i = 0; i<4; i++) {
			summe[i] = arrA[i] + arrB[i];
		}
		System.out.println( "Summe: " + summe[0] + " " + summe[1] + " " + summe[2] + " " + summe[3] );
	}
}
