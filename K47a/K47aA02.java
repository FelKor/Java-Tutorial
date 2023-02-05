

public class K47aA02 {
	public static void main(String[]args) {
		
		int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int max = 0;
		int max2 = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]>max2 && array[i]<max) {
				max2 = array[i];
			}
		}
		System.out.println("Das graeaete Element des Arrays: " + max);
		System.out.println("Das zweit graeaete Element des Arrays: " + max2);
	}
}
