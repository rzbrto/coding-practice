package newConcepts.Assignment3;

import java.util.Scanner;

public class HailStoneLoopRecursion {

    public static int next(int n) {
        if (n > 1) {
            if (n % 2 == 0) {
                return (n / 2);
            } else {
                return (3 * n) + 1;
            }
        }
        return -1;
    }

    private static String printSequenceHelper(int n) {
        if (n == 1) {
            return "1";
        }
        return n + ", " + printSequenceHelper(next(n));
    }

    public static void printSequence(int n) {
        System.out.println("[" + printSequenceHelper(n) + "]");
    }

    public static int lengthOfHailstone(int n) {
        return n == 1 ? 1 : 1 + lengthOfHailstone(next(n));
    }

    public static int largestValue(int n) {
        return n == 1 ? 1 : Math.max(n, largestValue(next(n)));
    }

    public static int lengthOfLongestHailstoneSequence(int n) {
        return n == 1 ? 1 : Math.max(lengthOfHailstone(n), lengthOfLongestHailstoneSequence(n - 1));
    }

    //takes an integer n and returns the start value of the longest hailstone sequence that starts on a value from 1 to n.
    public static int startValueOfLongestHailstoneSequence(int n) {
        if (n == 1) {
            return 1;
        }
        int start = startValueOfLongestHailstoneSequence(n - 1);
        if (lengthOfHailstone(n) > lengthOfHailstone(start)) {
            return n;
        }
        return start;
    }

    //reads an integer n and shows the value of next(n)
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("What number shall I start with? ");
        int n = kbd.nextInt();
        System.out.printf("The hailstone sequence starting at %d is:\n", n);
        printSequence(n);
        System.out.printf("The length of the sequence is %d.\n", lengthOfHailstone(n));
        System.out.printf("The largest number in the sequence is %d.\n", largestValue(n));
        System.out.printf("The longest hailstone sequence starting with a number up to %d has length %d.\n", n, lengthOfLongestHailstoneSequence(n));
        System.out.printf("The longest hailstone sequence starting with a number up to %d begins with %d.", n, startValueOfLongestHailstoneSequence(n));
    }

}
//http://www.cs.ecu.edu/karl/2530/fall17/Assn/Assn3/assn3.html
//Write and Test a java program that reads a number n from the standard input (after giving a suitable prompt) and then writes the following information on the standard output:
//
//    the entire hailstone sequence starting at n, all on one line, with the numbers separated by spaces;
//
//    the length of the hailstone sequence that starts with n;
//
//    the largest number in the hailstone sequence that starts with n;
//
//    the length of the longest hailstone sequence that starts with a number from 1 to n;
//
//    the starting number of the longest hailstone sequence that starts with a number from 1 to n.

