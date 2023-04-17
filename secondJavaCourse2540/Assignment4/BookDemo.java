package secondJavaCourse2540.Assignment4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDemo {

    public static void readBooksFromFile(ArrayList<Book> books) {
        Scanner reader;
        try {
            reader = new Scanner(new File("catalog.txt"));
        } catch (Exception e) {
            return;
        }
        while (reader.hasNextLine()) {
            String[] parts = reader.nextLine().split("\\s+");
            Book oneBook = new Book(parts);
            books.add(oneBook);
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        readBooksFromFile(books);

        for (Book book : books) {
            try {
                System.out.println(Book.bookSearch(books, book.getBookID()));
            } catch (BookNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            System.out.println(Book.bookSearch(books, 1));
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
