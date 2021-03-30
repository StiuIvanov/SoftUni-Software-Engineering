import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = Files.newBufferedReader(Path.of(path));
        String line = reader.readLine();

        while (line!=null){
            long sum = 0;

            for (int i = 0; i < line.length(); i++) {
                sum+= line.charAt(i);
            }

            System.out.println(sum);
            line= reader.readLine();
        }
    }
}
