package secondJavaCourse.Assignment4;

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
}
