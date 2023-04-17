package firstJavaCoursea1100.Assignment8;

import java.util.Scanner;

public class Triangle {
    public static void printNAsterisks(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the number of asterisks you would like to see printed out: ");
        int numOfAsterisks = kbd.nextInt();
        System.out.println();

        for (int i = 1; i <= numOfAsterisks; i++) {
            printNAsterisks(i);
            System.out.println();
        }
        for (int i = numOfAsterisks - 1; i > 0; i--) {
            printNAsterisks(i);
            System.out.println();
        }
    }


}
//Enter the number of asterisks you would like to see printed out:
//5
//
//*
//**
//***
//****
//*****
//****
//***
//**
//*