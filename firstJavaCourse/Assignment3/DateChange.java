package firstJavaCourse.Assignment3;

import java.util.Scanner;

public class DateChange {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a date in the form mon/day/year:");
        String originalDate = kbd.nextLine();
        String month = originalDate.substring(0, originalDate.indexOf("/"));
        String day = originalDate.substring(originalDate.indexOf("/") + 1, originalDate.lastIndexOf("/"));
        String year = originalDate.substring(originalDate.lastIndexOf("/") + 1);
        System.out.printf("Your date in European form is: %s.%s.%s", day, month, year);
    }
}
//    Enter a date in the form mon/day/years:
//        3/13/23
//
//        Your date in European form is:
//        13.3.23