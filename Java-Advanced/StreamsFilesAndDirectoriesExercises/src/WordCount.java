import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    private static final String WORDS_INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
    private static final String TEXT_INPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt";

    public static void main(String[] args) {
        try (BufferedReader wordBufferedReader = new BufferedReader(new FileReader(WORDS_INPUT_PATH));
             BufferedReader textBufferedReader = new BufferedReader(new FileReader(TEXT_INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            Map<String, Integer> wordsOccurences = new HashMap<>();
            String[] words = wordBufferedReader.readLine().split("\\s+");
            for (String word : words) {
                wordsOccurences.put(word, 0);
            }

            String[] text = textBufferedReader.readLine().split("\\s+");
            for (String s : text) {
                if (wordsOccurences.containsKey(s)) {
                    wordsOccurences.put(s, wordsOccurences.get(s) + 1);
                }
            }

            wordsOccurences.entrySet().stream()
                    .sorted((w1,w2)-> w2.getValue().compareTo(w1.getValue()))
                    .forEach(w-> {
                        writer.printf("%s - %d%n",w.getKey(),w.getValue());
                    });
            writer.close();
            textBufferedReader.close();
            wordBufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
