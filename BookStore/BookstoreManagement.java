import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Bookstore {
    private List<Book> books;

    public Bookstore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
         
            System.out.println("Books in the Bookstore:");
            System.out.println("-------------------------");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("-------------------------");
            }
    }

public class BookstoreManagement {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Adding books to the bookstore
        bookstore.addBook(new Book("Java Programming", "John Smith"));
        bookstore.addBook(new Book("Python for Beginners", "Alice Johnson"));
        bookstore.addBook(new Book("Data Structures and Algorithms", "Michael Brown"));

        // Displaying all books in the bookstore
        bookstore.displayBooks();

        // Searching books by title
        System.out.println("Searching books by title: 'java'");
        List<Book> searchResults = bookstore.searchByTitle("java");
        for (Book book : searchResults) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("-------------------------");
        }
        
        // Displaying updated list of books
        bookstore.displayBooks();
    }
}