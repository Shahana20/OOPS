
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //  Methods 

    public void displayBookDetails(){
        System.out.println(title + " by " + author + " [" + (isAvailable ? "Available" : "Not Available") + "]");
    }

    public void borrowBook() {
        if(isAvailable) {
            System.out.println("Successfully borrowed " + title);
            this.isAvailable = false;
        }
        else {
            System.out.println("The book is not available for borrow at this moment");
        }
    }

    public void returnBook() {
        this.isAvailable = true;
    }

}