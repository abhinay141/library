import org.example.models.Book;
import org.example.models.Patron;
import org.example.services.LibraryService;
import org.example.services.PatronService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        PatronService patronService = new PatronService();

        // Add books to the library
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "9780747532699", 1997);
        libraryService.addBook(book1);

        // Add patrons
        Patron patron1 = new Patron("Alice", "P001");
        patronService.addPatron(patron1);

        // Example of searching for a book by title
        System.out.println("Searching for books by title 'Harry Potter':");
        libraryService.searchByTitle("Harry Potter").forEach(book -> System.out.println(book.getTitle()));

        // Checkout a book (simplified)
        patron1.addBorrowedBook(book1.getIsbn());

        // Display borrowed books
        System.out.println("Borrowed books by " + patron1.getName() + ": " + patron1.getBorrowedBooks());
    }
}
