

public class K49Ca_A05 {
	public static void main(String[]args) {
		
		int[][] data = { 
				{3,2,5},
				{1,4,4,8,13},
				{9,1,0,2},
				{0,2,6,3,-1,-8}
		};
		
		for(int zeile=0; zeile < data.length; zeile++) {
			
			int max = 0;
			int spalte = 0;
			while(spalte < data[zeile].length) {
			
				if(data[zeile][spalte] > max) {
					max = data[zeile][spalte];								
				}
				spalte++;
			}
			System.out.println("Maximum der " + (zeile+1) + ". Zeile: " + max);
		}
	}
}
