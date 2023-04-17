package firstJavaCoursea1100.Assignment3;

import java.util.Scanner;

public class StringDisassemble {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        String firstAndLastName = kbd.nextLine();
        System.out.println("Your full name is: " + firstAndLastName);
        System.out.println("Your first name is: " + firstAndLastName.substring(0,firstAndLastName.indexOf(" ")));
        System.out.println("Your last name is: " + firstAndLastName.substring(firstAndLastName.lastIndexOf(" ") + 1));
    }
}
//Enter your first and last name:
//Jason Escobar
//
//Your full name is: Jason Escobar
//Your first name is: Jason
//Your last name is: Escobar