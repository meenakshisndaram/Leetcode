import java.util.List;
import java.util.*;
public class Pattern2 {

}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new IllegalStateException("Book is not available for borrowing");
        }
    }
    public void returnBook() {
        isAvailable = true;
    }
    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Borrowed)");
    }
}


class Library implements Iterable<Book> {
    private List<Book> books;
    private List<Book> recentlyReturnedBooks;
    public Library() {
        books = new ArrayList<>();
        recentlyReturnedBooks = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrow();
                return;
            }
        }
        System.out.println("Book not available for borrowing.");
    }
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                recentlyReturnedBooks.add(book);
                return;
            }
        }
        System.out.println("This book is not part of the library.");
    }
    public void displayAvailableBooks() {
         for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
    public Iterator<Book> backwardIterator() {
        return new Iterator<Book>() {
            private int currentIndex = recentlyReturnedBooks.size() - 1;
            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }
            @Override
            public Book next() {
                return recentlyReturnedBooks.get(currentIndex--);
            }
        };
    }
}
class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        System.out.println("Available Books:");
        library.displayAvailableBooks();
        library.borrowBook("1984");
        System.out.println("\nAfter borrowing '1984':");
        library.displayAvailableBooks();
        library.returnBook("1984");
        System.out.println("\nAfter returning '1984':");
        library.displayAvailableBooks();
        System.out.println("\nRecently Returned Books (Backward Iteration):");
        Iterator<Book> backwardIterator = library.backwardIterator();
        while (backwardIterator.hasNext()) {
            System.out.println(backwardIterator.next());
        }
    }
}