import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
        PrintWriter writer = new PrintWriter(fileOutputStream);

        int singleByte = fileInputStream.read();
        while (singleByte >= 0) {
            if (singleByte == 10  || singleByte == 32) {
                writer.print((char) singleByte);
            } else {
                writer.print(singleByte);
            }
            singleByte = fileInputStream.read();
        }
    }
}
