import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        Article bookArticle = new Article(text[0], text[1], text[2]);
        for (int i = 0; i <n ; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    bookArticle.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    bookArticle.setAuthor(command[1]);
                    break;
                case "Rename":
                    bookArticle.setTitle(command[1]);
                    break;
            }
        }

        System.out.println(bookArticle);

    }
}
