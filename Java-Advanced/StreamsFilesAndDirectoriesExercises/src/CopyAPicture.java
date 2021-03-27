import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture {
    private static final String PIC_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\8k 3 TRECA (7).jpg";
    private static final String OUTPUT_PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\picture-copy.jpg";

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(PIC_PATH);
             FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_PATH)){

            int oneByte = fileInputStream.read();
            while (oneByte>=0){
                fileOutputStream.write(oneByte);
                oneByte= fileInputStream.read();
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
