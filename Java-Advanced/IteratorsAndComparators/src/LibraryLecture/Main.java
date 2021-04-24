package LibraryLecture;


public class Main {
    public static void main(String[] args) {

        Book book = new Book("Smith John", 2001, "Theodor Wood", "Bill Gates");
        Book book1 = new Book("Lockwoodw", 1598, "Kortney", "Mariah Carey");
        Book book2 = new Book("Ophrey", 1998, "Peter Nate", "Smith");


        Library bookLibrary = new Library(book,book1,book2);

        for (Book book3 : bookLibrary) {
            System.out.println(book3);
        }

    }
}
