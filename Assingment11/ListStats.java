package Assingment11;

import java.util.Arrays;
import java.util.Scanner;

public class ListStats {
    public static int[] convertStringIntoIntArrayAndSorts(String positiveIntegers) {
        String[] stringArray = positiveIntegers.split(" ");
        if (stringArray.length > 100) {
            System.exit(0);
        }
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(intArray);
        return intArray;
    }

    public static float medianValue(int[] intArray) {
        int middle = intArray.length / 2;
        float median = 0;

        if (intArray.length % 2 == 0) {
            median = ((float) intArray[middle] + intArray[middle - 1]) / 2;
        } else {
            median = intArray[middle + 1];
        }
        return median;
    }

    public static float meanValue(int[] intArray) {
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return ((float) sum / intArray.length);
    }

    public static void numInArray(int[] intArray, int numberToSearchFor) {
        boolean b = false;
        int position = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == numberToSearchFor) {
                position = i;
                b = true;
            }
        }
        if (b) {
            System.out.println("The value entered, " + numberToSearchFor + ", was found at position " + position);
        } else {
            System.out.println("The value entered, " + numberToSearchFor + ", was not found.");
        }

    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a list of positive integers, including 0:\nThis program can hold up to 100 numbers:");
        String positiveIntegers = kbd.nextLine();
        int[] intArray = convertStringIntoIntArrayAndSorts(positiveIntegers);

        System.out.println("There were " + intArray.length + " number(s) read.");
        System.out.println("The minimum value given was " + intArray[0] + ".");
        System.out.println("The maximum number given was " + intArray[intArray.length - 1] + ".");
        System.out.printf("The median value of the array is %.2f\n", medianValue(intArray));
        System.out.printf("The mean value of the array is %.2f\n", meanValue(intArray));

        String yesOrNo = "y";
        do {
            System.out.println("\nEnter a number you wish to search for in the array.");
            int numberToSearchFor = kbd.nextInt();
            kbd.nextLine();
            numInArray(intArray, numberToSearchFor);
            System.out.println("Would you like to continue? Y/N");
            yesOrNo = kbd.nextLine();
        } while (yesOrNo.equalsIgnoreCase("y"));
    }

}

//Enter a list of positive integers, including 0:
//This program can hold up to 100 numbers:
//1 5 1 5 1 321  2 1 5 4 54 4 655 2 1 516 1 51 84
//There were 19 numbers(s) read.
//The minimum value given was 1.
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