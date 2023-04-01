package firstJavaCourse.Assignment7;

import java.util.Scanner;

public class TwelveDays {
    public static String suffix(int num) {
        return switch (num) {
            case 1 -> "1st";
            case 2 -> "2nd";
            case 3 -> "3rd";
            default -> num + "th";
        };
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        for (int i = 1; i < 13; i++) {

            System.out.printf("On the %s day of Christmas my true love game to me ", suffix(i));
            switch (i) {
                case 12:
                    System.out.println("Twelve Drummers Drumming,");
                case 11:
                    System.out.println("Eleven Pipers Piping,");
                case 10:
                    System.out.println("Ten Lords a Leaping,");
                case 9:
                    System.out.println("Nine Ladies Dancing,");
                case 8:
                    System.out.println("Eight Maids a Milking,");
                case 7:
                    System.out.println("Seven Swans a Swimming,");
                case 6:
                    System.out.println("Six Geese a Laying,");
                case 5:
                    System.out.println("Five Golden Rings,");
                case 4:
                    System.out.println("Four Calling Birds,");
                case 3:
                    System.out.println("Three French Hens,");
                case 2:
                    System.out.println("Two Turtle Doves, and");
                case 1:
                    System.out.println("A Partridge in a Pear Tree");
            }
            System.out.println("Press enter to continue");
            kbd.nextLine();
        }
    }
}

//On the 12th day of Christmas my true love game to me
//Twelve Drummers Drumming,
//Eleven Pipers Piping,
//Ten Lords a Leaping,
//Nine Ladies Dancing,
//Eight Maids a Milking,
//Seven Swans a Swimming,
//Six Geese a Laying,
//Five Golden Rings,
//Four Calling Birds,
//Three French Hens,
//Two Turtle Doves, and
//A Partridge in a Pear Tree
//This program will print out the lyrics for 12 Days of Christmas.
// It will start with day 1 and wait for the user to input the enter key to go no to the next day. after the 12 day, it will end.