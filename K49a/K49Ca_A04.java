

public class K49Ca_A04 {
	public static void main(String[]args) {
		
		int[][] data = { 
				{3,2,5},
				{1,4,4,8,13},
				{9,1,0,2},
				{0,2,6,3,-1,-8}
		};
		int max = 0;
		int min = 0;
		
		for(int zeile=0; zeile < data.length; zeile++) {
			for(int spalte=0; spalte < data[zeile].length; spalte++) {

				if(data[zeile][spalte] > max) {
					max = data[zeile][spalte];
				}
			}
		}
		for(int zeile=0; zeile < data.length; zeile++) {
			for(int spalte=0; spalte < data[zeile].length; spalte++) {

				if(data[zeile][spalte] < max || data[zeile][spalte] < min) {
					min = data[zeile][spalte];
				}
			}
		}
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
}
