package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("john", "smith");

        em1.setAlternateEmail("fds232@gmail.com");
        System.out.println(em1.showInfo());

    }
}
