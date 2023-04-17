package firstJavaCoursea1100.Assignment4;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double userTemp = kbd.nextDouble();
        System.out.print("Enter (C)elsius or (F)ahrenheit: ");
        String userTempType = kbd.next();

        if (userTempType.equalsIgnoreCase("c") || userTempType.equalsIgnoreCase("Celsius: ")) {
            System.out.print("The equivalent temperature in Celsius is: " + (userTemp * 1.8) + 32);
        } else if (userTempType.equalsIgnoreCase("f") || userTempType.equalsIgnoreCase("Fahrenheit: ")) {
            System.out.print("The equivalent temperature in Fahrenheit is: " + (userTemp - 32) / 1.8);
        } else {
            System.out.println("wrong info");
            System.exit(0);
        }


    }
}
//Enter a temperature: 32
//Enter (C)celsius or (F)ahrenheit: f
//The equivalent temperature in Celsius is: 0.0