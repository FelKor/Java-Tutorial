import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;

public class K105eA6 {
    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of("Test003.bin"));
        ByteBuffer buffer = ByteBuffer.wrap(data);
        buffer.order(ByteOrder.BIG_ENDIAN);

        int bytesPerInt = buffer.getInt();

        while (buffer.hasRemaining()) {
            int value;
            if (bytesPerInt == 1) {
                value = buffer.get();
            } else if (bytesPerInt == 2) {
                value = buffer.getShort();
            } else {
                value = buffer.getInt();
            }
            System.out.println(value);
        }
    }
}
