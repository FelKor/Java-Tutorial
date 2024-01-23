import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class K105eA03 {
        public static void main(String[] args) {
        String fileName = "ints.dat";
        long sum = 0;

        try (DataInputStream instr = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            while (true) {
                sum += instr.readInt();
            }
        } catch (EOFException e) {
            System.out.println("The sum is: " + sum);
        } catch (IOException e) {
            System.out.println("Problems reading " + fileName);
        }
    }
}
