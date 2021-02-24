import java.util.*;
import java.util.stream.Collectors;

public class Articles02 {
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
            return String.format("%s -%s:%s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] stringArticle = scanner.nextLine().split(",");
            Article currentArticle = new Article(stringArticle[0], stringArticle[1], stringArticle[2]);
            books.add(currentArticle);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "title":
                books.sort(Comparator.comparing(Article::getTitle));
                for (Article a : books) {
                    System.out.println(a);
                }
                break;
            case "content":
                books.sort(Comparator.comparing(Article::getContent));
                for (Article a : books) {
                    System.out.println(a);
                }
                break;
            case "author":
                books.sort(Comparator.comparing(Article::getAuthor));
                for (Article a : books) {
                    System.out.println(a);
                }
                break;
        }

    }
}

