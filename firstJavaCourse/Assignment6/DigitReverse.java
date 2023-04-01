package firstJavaCourse.Assignment6;

import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int input = kbd.nextInt();

        System.out.println("Your number printed in reverse order is:");
        while (input != 0) {
            System.out.print(input % 10);
            input = input / 10;
        }
    }
}
//Please enter an integer: 123456789
//Your number printed in reverse order is:
//987654321