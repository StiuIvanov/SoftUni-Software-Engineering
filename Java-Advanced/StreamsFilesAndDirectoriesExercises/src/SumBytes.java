    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = Files.newBufferedReader(Path.of(path));
        String line = reader.readLine();

        long sum = 0;
        while (line!=null){

            for (int i = 0; i < line.length(); i++) {
                sum+= line.charAt(i);
            }

            line= reader.readLine();
        }
        System.out.println(sum);
    }
}
