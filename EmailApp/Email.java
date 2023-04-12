package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private final String firstName;
    private final String lastName;
    private final String email;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    int mailboxCapacity = 500;
    private String alternateEmail;
    private final String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        if (department.equals("not an option")) {
            System.exit(0);
        }

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nYour password is: " + password + "\n");

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }

    private String setDepartment() {
        System.out.print("New Worker: " + firstName + " " + lastName + ".\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department Code: ");
        Scanner kbd = new Scanner(System.in);
        int departmentChoice = kbd.nextInt();
        return switch (departmentChoice) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> "not an option";
        };
    }

    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {this.mailboxCapacity = mailboxCapacity;}

    public void setAlternateEmail(String alternateEmail) {this.alternateEmail = alternateEmail;}

    public void changePassword(String password) {this.password = password;}

    public int getMailboxCapacity() {return mailboxCapacity;}

    public String getAlternateEmail() {return alternateEmail;}

    public String getPassword() {return password;}

    public String showInfo() {
        return """
                Display Name:     %s %s
                Company Email:    %s
                Mailbox Capacity: %d mb""".formatted(firstName, lastName, email, mailboxCapacity);
    }
}
