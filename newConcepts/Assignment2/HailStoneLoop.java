package newConcepts.Assignment2;

import java.util.Scanner;

public class HailStoneLoop {

    //takes an integer value n and returns the number that follows n in a hailstone sequence
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

    // takes an integer n and writes the entire hailstone sequence starting at n
    public static void printSequence(int n) {
        int curr = n;
        System.out.print("[");
        while (curr > 1) {
            System.out.print(curr + ", ");
            curr = next(curr);
        }
        System.out.println("1]");
    }

    // takes an integer n and returns the length of the hailstone sequence starting at n
    public static int lengthOfHailstone(int n) {
        int counter = 1;
        int curr = n;
        while (curr > 1) {
            curr = next(curr);
            counter++;
        }
        return counter;
    }

    // takes an integer n and returns the largest value in the hailstone sequence starting at n.
    public static int largestValue(int n) {
        int largest = n;
        int curr = n;
        while (curr > 1) {
            curr = next(curr);
            largest = Math.max(curr, largest);
        }
        return largest;
    }

    //takes an integer n and returns the length of the longest hailstone sequence starting at a number from 1 to n.
    public static int lengthOfLongestHailstoneSequence(int n) {
        int longest = 0;
        for (int i = 1; i <= n; i++) {
            int length = lengthOfHailstone(i);
            longest = Math.max(longest, length);
        }
        return longest;
    }

    //takes an integer n and returns the start value of the longest hailstone sequence that starts on a value from 1 to n.
    public static int startValueOfLongestHailstoneSequence(int n) {
        int start = 0;
        int longest = 0;
        for (int i = 1; i <= n; i++) {
            int length = lengthOfHailstone(i);
            if (length > longest) {
                longest = length;
                start = i;
            }
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
//http://www.cs.ecu.edu/karl/2530/fall17/Assn/Assn2/assn2.html
//Write and test a java program that reads a number n from the standard input (after giving a suitable prompt) and then writes the following information on the standard output:
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