package Assignment2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double firstNumber = kbd.nextDouble();
        double secondNumber = kbd.nextDouble();
        DecimalFormat df =  new DecimalFormat("0");
        df.setMaximumFractionDigits(10);
        String sum = "The sum of your numbers is";
        String difference = "The difference of your numbers is";
        String product = "The product of your numbers is";
        int indent = 5;
        int sumSpaces = 7 + indent;
        int productSpaces = 3 + indent;
        System.out.printf(sum + "%" + sumSpaces + "s%s\n", "", df.format(firstNumber + secondNumber));
        System.out.printf(difference + "%" + indent + "s%s\n", "", df.format(firstNumber - secondNumber));
        System.out.printf(product + "%" + productSpaces + "s%s\n", "", df.format(firstNumber * secondNumber));
        //System.out.printf("The product of your numbers is%8s%s","", df.format(firstNumber * secondNumber) );
    }
}
//        Enter two numbers
//        5
//        10
//        The sum of your numbers is            15.0
//        The difference of your numbers is     -5.0
//        the product of your numbers is        50.0