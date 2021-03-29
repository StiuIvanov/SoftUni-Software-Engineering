import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumbers {
    private static final String INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            int count =0;
            String line = bufferedReader.readLine();
            while (line != null) {
                count++;
                writer.printf("%d. ",count);
                writer.println(line);

                line = bufferedReader.readLine();
            }
            writer.close();
            bufferedReader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
