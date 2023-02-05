

public class K49Ca_A06 {
	public static void main(String[]args) {
		
		int[][] data = { 
				{3,2,5},
				{1,4,4,8,13},
				{9,1,0,2},
				{0,2,6,3,-1,-8}
		};
		
		for(int zeile=0; zeile < data.length; zeile++) {
			int temp = 0;
			
			int spalte = 0;
			while(spalte < data[zeile].length/2) {
				temp = data[zeile][data[zeile].length-spalte-1];
				data[zeile][data[zeile].length-spalte-1] = data[zeile][spalte];
				data[zeile][spalte] = temp;
				spalte++;
			}
		}
		
		for(int j=0; j < data.length; j++) {
			for(int i=0; i < data[j].length; i++) {
				System.out.print(data[j][i] + " ");
			}
			System.out.println();
		}
	}
}
