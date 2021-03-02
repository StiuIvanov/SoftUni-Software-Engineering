import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("&");
        List<String> bookShelf = new ArrayList<>();
        for (int i = 0; i <inputText.length ; i++) {
            bookShelf.add(inputText[i]);
        }

        String commandEnd = scanner.nextLine();
        while (!commandEnd.equals("Done")){
            String[] tokens = commandEnd.split("\\| ");
            String command = tokens[0];
            String infoForChange = tokens[1];

            switch (command){
                case "Add Book ":
                    if (!bookShelf.contains(infoForChange)) {
                        bookShelf.add(0, infoForChange);
                    }
                    break;
                case "Take Book ":
                    if (bookShelf.contains(infoForChange)) {
                        bookShelf.remove(infoForChange);
                    }
                    break;
                case "Swap Books ":
                    String firstBook = infoForChange;
                    String secondBook = tokens[2];
                    firstBook = firstBook.substring(0, firstBook.length()-1);

                    if ((bookShelf.contains(firstBook) && bookShelf.contains(secondBook))){
                        int indexFirstBook = bookShelf.indexOf(firstBook);
                        int indexSecondBook = bookShelf.indexOf(secondBook);
                        String oldBook = bookShelf.get(indexFirstBook);
                        bookShelf.set(indexFirstBook, secondBook);
                        bookShelf.set(indexSecondBook, oldBook);
                    }
                    break;
                case "Insert Book ":
                    bookShelf.add(infoForChange);
                    break;
                case "Check Book ":
                    int indexForCheck = Integer.parseInt(infoForChange);
                    if (indexForCheck>=0 && indexForCheck<=bookShelf.size()-1){
                        System.out.println(bookShelf.get(indexForCheck));
                    }
                    break;
            }

            commandEnd =scanner.nextLine();
        }

        for (int i = 0; i <bookShelf.size() ; i++) {
            System.out.print( bookShelf.get(i));
            if (i<bookShelf.size()-1){
                System.out.print( ", ");
            }
        }


    }
}
