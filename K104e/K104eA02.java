import java.io.*;

public class K104eA02 {
    public static void main ( String[] args ) throws IOException
    {
        String fileName = "Data.dat" ;
        DataOutputStream out = new DataOutputStream( 
            new FileOutputStream(
                fileName) );
   
        for(int i=0; i<=64; i++){
            out.writeShort(i);
        }
        for(int i=0; i<=64; i++){
            out.writeInt(i);
        }
        for(int i=0; i<=64; i++){
            out.writeDouble(i);
        }
        out.close();
    }
}
