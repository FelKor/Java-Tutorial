

public class K47aA04 {
	public static void main(String[]args) {
		
		int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
	    int[] geglaettet = new int[12];

	    geglaettet[0]  = signal[0] + signal[1]/2;
	    geglaettet[ signal.length-1 ] = (signal[signal.length-2]+signal[signal.length-3])/2;
	    for (int i = 1; i<signal.length-1; i++){
	    	geglaettet[i] = (signal[i-1]+signal[i]+signal[i+1])/3;
	    }

	    for ( int j = 0; j < signal.length; j++) {
	    	System.out.print(signal[j] + ", ");
	    }
	    System.out.println();
	    
	    System.out.print(geglaettet[0] + ", ");
	    for ( int j = 1; j < geglaettet.length-1; j++) {
	    	System.out.print(geglaettet[j] + ", ");
	    }
	    System.out.print(geglaettet[geglaettet.length-1]);
	}
}


