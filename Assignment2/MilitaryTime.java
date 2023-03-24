package Assignment2;

import java.util.Scanner;

public class MilitaryTime {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = kbd.nextInt();
        System.out.println("Please enter the second time: ");
        int secondTime = kbd.nextInt();
        int firstTimeMinutes = ((firstTime / 100) * 60) + (firstTime % 100);
        int secondTimeMinutes = ((secondTime / 100) * 60) + (secondTime % 100);
        int differenceInMinutes = secondTimeMinutes - firstTimeMinutes;

        if (differenceInMinutes < 0) { differenceInMinutes += (24 * 60); }

        System.out.printf("The difference in the two times is %d hour(s) and %d minutes(s)", differenceInMinutes / 60, differenceInMinutes % 60);

    }
}
/*
  Please enter the first time: 0050
  Please enter the second time: 0100
  The difference in the two times is 0 hour(s) and 10 minutes(s)

  Please enter the first time: 0050
  Please enter the second time: 0040
  The difference in the two times is 23 hour(s) and 50 minutes(s)

  Please enter the first time: 2359
  Please enter the second time: 0001
  The difference in the two times is 0 hour(s) and 2 minutes(s)
 */