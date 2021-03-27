import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AllCapitals {
    private static final String INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_PATH));
        PrintWriter writer = new PrintWriter(OUTPUT_PATH);

        String line = bufferedReader.readLine();
        while (line != null) {
            writer.print(line.toUpperCase());
            writer.print(System.lineSeparator());

            line = bufferedReader.readLine();
        }

        writer.close();

    }
}
