import java.util.Scanner;
import java.io.*;

public class K104eA03 {
    public static void main(String[] args) throws FileNotFoundException{
        try{

            Scanner scan = new Scanner(System.in);
            System.out.println("Name des Input files:");
            String infileName = scan.nextLine();
            BufferedReader in = new BufferedReader(
                new FileReader(infileName));
            
            System.out.println("Name des Output files:");
            String outfileName = scan.nextLine();
            DataOutputStream out = new DataOutputStream( 
              new BufferedOutputStream(
                new FileOutputStream(
                    outfileName) ) );
            scan.close();
    
            String thisLine = null;
            while((thisLine=in.readLine())!=null){
                try{
                    out.writeInt(Integer.parseInt(thisLine));
                    System.out.println(Integer.parseInt(thisLine));
                } catch(Exception e){
                    out.writeUTF("Error Int can't be read!");
                }
                out.close();
                in.close();
            } 
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
