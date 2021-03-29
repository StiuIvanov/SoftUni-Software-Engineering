import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes {
    private static final String INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            Set<Character> punctuation = new HashSet<>();
            punctuation.add('!');
            punctuation.add(',');
            punctuation.add('.');
            punctuation.add('?');

            int vowelsCount = 0;
            int consonantCount = 0;
            int punctuationsCount = 0;

            String line = bufferedReader.readLine();
            while (line!=null){
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    if (vowels.contains(symbol)){
                        vowelsCount++;
                    }else if (punctuation.contains(symbol)){
                        punctuationsCount++;
                    }else if (symbol!= ' '){
                       consonantCount++;
                    }
                }

                line= bufferedReader.readLine();
            }
            writer.printf("Vowels: %d%n", vowelsCount);
            writer.printf("Consonants: %d%n", consonantCount);
            writer.printf("Punctuation: %d",punctuationsCount);
            bufferedReader.close();
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
