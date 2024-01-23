import java.io.*;

public class K105eA02_Write {
    public static void main ( String[] args ) throws IOException{
        
        long startTime = System.currentTimeMillis();

        File file = new File("Data.txt");
        FileWriter fileWriter = new FileWriter(file);
        
        for(int i = 0; i<1000000; i++){
            fileWriter.write(i + "\n");
        }
        fileWriter.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
