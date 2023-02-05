

public class K47aA03b {
	public static void main(String[]args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] ziel = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < array.length; i++) {
			ziel[array.length - 1 - i] = array[i];
			}
		
		for(int j = 0; j < array.length; j++) {
			System.out.print(ziel[j] + ", ");
		}
	}
}
