import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeArrayList {
    private static final String PATH = "C:\\Users\\Stiu\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\list.ser";

    public static void main(String[] args) {
        List<Double> list = List.of(5.5, 3.2, 1.0, 5.4);
        try (FileOutputStream fileOutputStream = new FileOutputStream(PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            objectOutputStream.writeObject(list);

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
