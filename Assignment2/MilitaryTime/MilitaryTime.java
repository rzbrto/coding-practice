package Assignment2.MilitaryTime;

import java.util.Scanner;

public class MilitaryTime {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = kbd.nextInt();
        System.out.println("Please enter the second time: ");
        int secondTime = kbd.nextInt();


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