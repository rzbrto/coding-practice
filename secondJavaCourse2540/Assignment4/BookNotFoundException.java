package secondJavaCourse2540.Assignment4;

public class BookNotFoundException extends Exception {

    public BookNotFoundException() {
        super("can't find book");
    }

    public BookNotFoundException(String s) {
        super(s);
    }
}
