import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFiles {
    private static final String FIRST_INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
    private static final String SECOND_INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\mergedFile.txt";

    public static void main(String[] args) {
        try (BufferedReader firstReader = new BufferedReader(new FileReader(FIRST_INPUT_PATH));
             BufferedReader secondReader = new BufferedReader(new FileReader(SECOND_INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH);){

            String lineFirstFile = firstReader.readLine();
            while (lineFirstFile!=null){
                writer.println(lineFirstFile);
                lineFirstFile = firstReader.readLine();
            }

            String lineSecondFile = secondReader.readLine();
            while (lineSecondFile!=null){
                writer.println(lineSecondFile);
                lineSecondFile=secondReader.readLine();
            }

            writer.close();
            firstReader.close();
            secondReader.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
