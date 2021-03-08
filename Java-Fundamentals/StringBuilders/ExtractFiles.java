import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String directory = scanner.nextLine();

        int indexStart = directory.lastIndexOf('\\')+1;
        int indexEnd = directory.lastIndexOf('.');

        String fileName = directory.substring(indexStart,indexEnd);
        String fileExtension = directory.substring(indexEnd+1);

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);

    }
}
