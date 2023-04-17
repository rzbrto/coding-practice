package firstJavaCoursea1100.Assignment2;

import java.util.Scanner;

public class TimeCalc {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number of hours:");
        int hours = kbd.nextInt();
        System.out.println("Enter a number of minutes:");
        int minutes = kbd.nextInt();
        System.out.println("Enter a number of seconds:");
        int seconds = kbd.nextInt();
        System.out.println("The total number of seconds is: " + ((((hours * 60) + minutes) * 60) + seconds));
    }
}
//    Enter a number of hours:
//        5
//        Enter a number of minutes:
//        2
//        Enter a number of seconds:
//        1
//
//        The total number of seconds is: 18121