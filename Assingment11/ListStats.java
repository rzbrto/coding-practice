package Assingment11;

import java.util.Scanner;

public class ListStats {
    public static int[] convertStringIntoIntArray(String positiveIntegers) {
        Scanner kbd = new Scanner(System.in);
        positiveIntegers = kbd.nextLine();
        String[] stringArray = positiveIntegers.split(" ");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length + 1; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static int printANumberInIntArray(int[] intArray, int position) {
        return intArray[position];
    }

    public static int totalAmountOfNumbers(int[] intArray) {
        int numOfNums = 0;
        for (int i = 0; i < intArray.length; i++) {
            numOfNums++;
        }
        return numOfNums;
    }
    public static int minValueGiven(int[] intArray) {
        int num = 0;
        int lowest = 0;
        for (int i = 0; i < intArray.length; i++) {
            num = intArray[i];
            if(num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a list of positive integers, including 0:\nThis program can hold up to 100 numbers:");
        String positiveIntegers = kbd.nextLine();
        int[] intArray = convertStringIntoIntArray(positiveIntegers);

        System.out.println(printANumberInIntArray(intArray, 0));
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