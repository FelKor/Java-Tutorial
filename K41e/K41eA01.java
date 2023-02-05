

public class K41eA01 {
	public static void main(String[]args) {
		
		double power = 1;
		
		for(int t=1; t<=25; t++) {	
			power = power*0.83;
			double N = 220/(1 + 10*power);
			System.out.println("Schafe nach " + t + " Jahren: " + N);
		}
	}
}
