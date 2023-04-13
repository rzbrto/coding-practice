package secondJavaCourse.Assignment4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private int bookID;
    private String title, ISBN, author;
    private char type;

    public Book(int bookID, String title, String ISBN, String author, char type) {
        this.bookID = bookID;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.type = Character.toLowerCase(type);
    }

    public Book(String[] array) {
        this.bookID = Integer.parseInt(array[0]);
        this.title = array[1];
        this.ISBN = array[2];
        this.author = array[3];
        this.type = array[4].charAt(0);
    }

    //returns the book with that id
    public static Book bookSearch(ArrayList<Book> books, int id) throws BookNotFoundException {
        for (Book book : books) {
            if (book.bookID == id) {
                return book;
            }
        }
        throw new BookNotFoundException("book with ID: \"%s\" not found".formatted(id));
    }

    @Override
    public String toString() {
        return """
                BookID: %s
                Title:  %s
                ISBN:   %s
                Author: %s
                Type:   %s
                """.formatted(
                bookID,
                title,
                ISBN,
                author,
                type == 'f' ? "Fiction" : "Non-Fiction");
    }

    public int getBookID() {
        return bookID;
    }
}

