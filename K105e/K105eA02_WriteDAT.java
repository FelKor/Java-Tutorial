import java.io.*;

public class K105eA02_WriteDAT {
      public static void main ( String[] args ) throws IOException{
        
        long startTime = System.currentTimeMillis();

        File file = new File("Data.dat");
        DataOutputStream out = new DataOutputStream( 
            new FileOutputStream(
                file) );
        
        for(int i = 0; i<1000000; i++){
            out.writeInt(i);
        }
        out.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
