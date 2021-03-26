import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        PrintWriter writer = new PrintWriter(fileOutputStream);

        Set<Character> punctuations = new HashSet<>();
        punctuations.add(',');
        punctuations.add('.');
        punctuations.add('!');
        punctuations.add('?');

        int singleByteReaded = fileInputStream.read();
        while (singleByteReaded >= 0) {
            char symbol = (char) singleByteReaded;
            if (!punctuations.contains(symbol)) {
                writer.print(symbol);
            }

            singleByteReaded = fileInputStream.read();
        }
        writer.close();
    }
}
