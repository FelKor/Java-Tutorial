import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class K105eA02_ReadDAT {
     public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        File file = new File("Data.dat");
        FileInputStream inputStream = new FileInputStream(file);
        FileChannel fileChannel = inputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(4);
        int sum = 0;

        while (fileChannel.read(buffer) != -1) {
            buffer.flip();
            int number = buffer.getInt();
            sum += number;
            buffer.clear();
        }

        fileChannel.close();
        inputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Sum of binary file: " + sum);
        System.out.println(endTime-startTime);
    }
}