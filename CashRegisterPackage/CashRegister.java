package CashRegisterPackage;

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the quantity of the first product: ");
        int firstQuantity = kbd.nextInt();
        System.out.println("Enter the price of the first product: $");
        float firstPrice = kbd.nextFloat();
        System.out.println("Enter the quantity of the second product: ");
        int secondQuantity = kbd.nextInt();
        System.out.println("Enter the price of the second product: $");
        float secondPrice = kbd.nextFloat();
        System.out.println("Enter the quantity of the third product: ");
        int thirdQuantity = kbd.nextInt();
        System.out.println("Enter the price of the third product: $ ");
        float thirdPrice = kbd.nextFloat();
        System.out.println("");
        float subtotal= firstPrice + secondPrice + thirdPrice;
        System.out.println("Subtotal: $" + subtotal);
        float salesTax = subtotal * 0.07f;
        System.out.println("Sales Tax: $" + salesTax);
        float total = subtotal + salesTax;
        System.out.println("Total Due: $" + ((int)((total + .005f) * 100))/100f);
    }
}
