

public class K49Ca_A03 {
	public static void main(String[]args) {
		
		int[][] data = { 
				{3, 2, 5},
				{1, 4, 4, 8, 13},
				{9, 1, 0, 2},
				{0, 2, 6, 3, -1, -8} };
		int summe = 0;
		int maxlength=0;
		
		for(int zeile=0; zeile<data.length; zeile++) {
			for(int spalte=0; spalte<data[zeile].length; spalte++) {
				
				if(data[zeile].length>maxlength) {
					maxlength=data[zeile].length;
				}
			}
		}
		int[][] data2 = new int[data.length][maxlength];
		
		for(int zeile=0; zeile<data2.length; zeile++) {
			for(int spalte=0; spalte<data2[zeile].length; spalte++) {
				data2[zeile][spalte] = 0;
			}
		}
		
		for(int zeile=0; zeile<data.length; zeile++) {
			for(int spalte=0; spalte<data[zeile].length; spalte++) {
				data2[zeile][spalte] = data[zeile][spalte];
			}
		}
		
		for(int spalte=0; spalte<maxlength; spalte++) {
			for(int zeile=0; zeile<data.length; zeile++) {
				summe += data2[zeile][spalte];
			}
			System.out.println("Die Summe der " + (spalte+1) + ". Spalte lautet " + summe);
			summe = 0;
		}
	}

}
