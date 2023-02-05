

public class K49Ca_A02 {
	public static void main(String[]args) {
		
		int[][] data = { 
				{3, 2, 5},
				{1, 4, 4, 8, 13},
				{9, 1, 0, 2},
				{0, 2, 6, 3, -1, -8} };
		int summe = 0;
		
		for(int zeile=0; zeile<data.length; zeile++) {
			for(int spalte=0; spalte<data[zeile].length; spalte++) {
				summe += data[zeile][spalte];
			}
			System.out.println("Summe der " + (zeile+1) + ". Zeile ist: " + summe);
			summe = 0;
		}
	}

}
