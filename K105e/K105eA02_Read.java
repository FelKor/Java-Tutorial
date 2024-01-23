import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class K105eA02_Read {
    public static void main(String[] args) throws FileNotFoundException {

        long startTime = System.currentTimeMillis();
        File file = new File("BufferedData.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

        scanner.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Sum of text file: " + sum);
        System.out.println(endTime-startTime);
    }
}
