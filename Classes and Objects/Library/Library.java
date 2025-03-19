import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for(Book book : books) {
            book.displayBookDetails();
        }
    }

    public void borrowBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found");
    }

}
