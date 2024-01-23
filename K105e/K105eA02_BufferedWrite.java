import java.io.*;

public class K105eA02_BufferedWrite {
    public static void main ( String[] args ) throws IOException{
        
        long startTime = System.currentTimeMillis();

        File file = new File("BufferedData.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        for(int i = 0; i<1000000; i++){
            bufferedWriter.write(i + "\n");
        }
        fileWriter.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
