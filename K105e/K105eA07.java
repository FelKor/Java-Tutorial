import java.io.*;

public class K105eA07 {

    public static void main(String[] args) {

        copyFile("CopyOfK105_A4.java", "CopyOfK105_A4__2.java");
        copyFile("CopyOfK105_A4.class",  "CopyOfK105_A4__2.class");
    }
//Man kann die Datei einfach entschlüsseln, indem er die Datei erneut durch das Programm ausführen. ^_^
    private static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    buffer[i] = (byte) ~buffer[i];
                }
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Kopiert: " + destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
