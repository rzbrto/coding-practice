package Assingment11;

import java.util.Scanner;

public class ListStats {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("""
                Enter a list of positive integers, including 0:
                This program can hold up to 100 numbers:
                To stop counting before 100 numbers are given, enter a negative number upon completion of your list.
                """);
        String positiveIntegers = kbd.nextLine();


    }
}
//Enter a list of positive integers, including 0:
//This program can hold up to 100 numbers:
//1 5 1 5 1 321  2 1 5 4 54 4 655 2 1 516 1 51 84
//There were 19 numbers(s) read.
//The minimuum value given was 1.
//The maximum number given was 84.
//The median value of the array is 4.0.
//The mean value of the array is 90.21052631578948.
//
//Enter a number you wish to search for in the array.
//12321
//The value entered, 12321, was not found.
//Would you like to continue? Y/N
//y
//
//Enter a number you wish to search for in the array.
//655
//The value entered, 655, was found at position 13.
//Would you like to continue? Y/N
//n