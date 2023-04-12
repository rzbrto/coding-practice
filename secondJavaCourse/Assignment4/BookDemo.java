package secondJavaCourse.Assignment4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDemo {

    public static void readBooksFromFile(ArrayList<Book>books){
        Scanner reader;
        try {
            reader = new Scanner(new File("catalog.txt"));
        } catch (Exception e) {
            return;
        }
        while(reader.hasNextLine()) {
            String[] parts = reader.nextLine().split("\\s+");
            Book book = new Book(parts);
            books.add(book);
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        readBooksFromFile(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
