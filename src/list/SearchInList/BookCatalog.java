package list.SearchInList;

import list.SearchInList.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> books;

    public BookCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        Book book = new Book(title, author, publicationYear);
        this.books.add(book);
    }

    public void findByAuthor(String author) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Publish Year: " + book.getPublicationYear());
                }
            }
        } else {
            System.out.println("No Book Found");
        }

        System.out.printf("We do not have books with author: %s", author);
    }

    public void findByTime(int startYear, int endYear) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getPublicationYear() >= startYear && book.getPublicationYear() <= endYear) {
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Publish Year: " + book.getPublicationYear());
                }
            }
        } else {
            System.out.println("No Book Found");
        }

        System.out.printf("We do not have books between %d and %d%n", startYear, endYear);
    }

    public void findByTitle(String title) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Publish Year: " + book.getPublicationYear());
                }
            }
        } else {
            System.out.println("No Book Found");
        }

        System.out.printf("We do not have books with title: %s", title);
    }

    public static void main(String[] args) {

        final BookCatalog catalog = new BookCatalog();

        Book book1 = new Book("Book 1", "Author 1", 2018);
        Book book2 = new Book("Book 2", "Author 2", 2003);
        Book book3 = new Book("Book 3", "Author 3", 1998);

        catalog.addBook(book1.getTitle(), book1.getAuthor(), book1.getPublicationYear());
        catalog.addBook(book2.getTitle(), book2.getAuthor(), book2.getPublicationYear());
        catalog.addBook(book3.getTitle(), book3.getAuthor(), book3.getPublicationYear());

        System.out.println("Find by author");
        catalog.findByAuthor("Author 4");
        System.out.println("\nFind by time");
        catalog.findByTime(2009, 2010);
        System.out.println("\nFind by title");
        catalog.findByTitle("Book 4");
    }
}
