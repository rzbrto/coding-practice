package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + firstName + " " + lastName);
        this.department = setDepartment();
        System.out.println("Department: " + department);
    }

    private String setDepartment() {
        System.out.print("Department Code:\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department Code: ");
        Scanner kbd = new Scanner(System.in);
        int departmentChoice = kbd.nextInt();
        return switch (departmentChoice) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> null;
        };
    }
}
