import java.io.*;

public class K105eA08 {
    public static void main(String[] args){
        int data, low_four, high_four;
        String inputfilename = "C:\\Users\\felix\\Desktop\\VSCode\\Java-Tutorial\\K105eTest\\test_K105eA08.dat";
        int counter =0;

        try{
            FileInputStream inputStream = new FileInputStream(inputfilename);
            while((data= inputStream.read()) != -1){
                low_four = data&0X0000000F;
                high_four = data&0X000000F0;
                high_four = high_four>>>4;

                int half_byte=high_four;
                for(int i=0; i<2; i++){
                    if(half_byte==0b0000){
                        System.out.print("0");
                    } else if(half_byte==0b0001){
                        System.out.print("1");
                    }else if(half_byte==0b0010){
                        System.out.print("2");
                    }else if(half_byte==0b0011){
                        System.out.print("3");
                    }else if(half_byte==0b0100){
                        System.out.print("4");
                    }else if(half_byte==0b0101){
                        System.out.print("5");
                    }else if(half_byte==0b0110){
                        System.out.print("6");
                    }else if(half_byte==0b0111){
                        System.out.print("7");
                    }else if(half_byte==0b1000){
                        System.out.print("8");
                    }else if(half_byte==0b1001){
                        System.out.print("9");
                    }else if(half_byte==0b1010){
                        System.out.print("A");
                    }else if(half_byte==0b1011){
                        System.out.print("B");
                    }else if(half_byte==0b1100){
                        System.out.print("C");
                    }else if(half_byte==0b1101){
                        System.out.print("D");
                    }else if(half_byte==0b1110){
                        System.out.print("E");
                    }else if(half_byte==0b1111){
                        System.out.print("F");
                    } else{
                        System.out.print("unwandlungs Fehler");
                    }
                    half_byte = low_four;
                    counter++;
                    if(counter>=16){
                        System.out.println();
                        counter=0;
                    }
                }
                System.out.print(" ");
            }
        inputStream.close();
    } catch(Exception e){
        System.out.println("Exeption fehler");
    }
    }
}
