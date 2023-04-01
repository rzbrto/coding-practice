package firstJavaCourse.Assignment4;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the price of the item\n(from 25 cents to a dollar, in 5-cent increments):");
        int priceOfItem = kbd.nextInt();

        if (priceOfItem % 5 != 0 || priceOfItem < 25 || priceOfItem > 100) {
            System.out.println("wrong info");
            System.exit(0);
        }

        int quarters, dimes, nickles;
        int change = 100 - priceOfItem;
        quarters = change / 25;
        change = change % 25;
        dimes = change / 10;
        change = change % 10;
        nickles = change / 5;

        System.out.printf("""
                        You bought an item for %d cents and gave me a dollar,
                        so your change is:
                        %d quarter(s),
                        %d dime(s), and
                        %d nickle(s).""", priceOfItem, quarters, dimes, nickles);
    }
}
//Enter the price of the item.
//(from 25 cents to a dollar, in 5-cent increments):70
//You bought an item for  cents and gave me a dollar,
// so your change is:
// 1 quarter(s),
// 0 dime(s), and
// 1 nickel(s).