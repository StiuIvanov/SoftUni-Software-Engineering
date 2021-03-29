import java.io.*;

public class GerFolderSize {
    private static final String DIR_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(OUTPUT_PATH);

        File folder = new File(DIR_PATH);
        File[] files = folder.listFiles();
        long size = 0;

        if (files != null) {
            for (File file : files) {
                size += file.length();
            }
        }
        writer.println("Folder size: " + size);
        writer.close();

    }
}
