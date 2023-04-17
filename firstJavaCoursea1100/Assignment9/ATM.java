package firstJavaCoursea1100.Assignment9;

import java.util.Scanner;


public class ATM {

    public static String checkID(String accountNumber, String password) {
        String a = "44567-5 mypassword 520.36";
        String b = "1234567-6 anotherpassword 48.20";
        String c = "4321-0 betterpassword 96.74";

        String userCreds = String.join(" ", accountNumber, password);
        if (userCreds.equals(a.substring(0, a.lastIndexOf(" ")))) {
            return a.substring(a.lastIndexOf(" ") + 1);
        }
        if (userCreds.equals(b.substring(0, b.lastIndexOf(" ")))) {
            return b.substring(b.lastIndexOf(" ") + 1);
        }
        if (userCreds.equals(c.substring(0, c.lastIndexOf(" ")))) {
            return c.substring(c.lastIndexOf(" ") + 1);
        }
        return "wrong";
    }

    public static float getBalance() {
        Scanner kbd = new Scanner(System.in);
        String balance;
        int attempts = 1;
        do {
            if (attempts > 3) {
                System.exit(0);
            }
            System.out.println("Account Number:");
            String accountNumber = kbd.nextLine();
            System.out.println("Password:");
            String password = kbd.nextLine();
            balance = checkID(accountNumber, password);
            attempts++;
        } while (balance.equals("wrong"));
        return Float.parseFloat(balance);
    }

    public static void printBalance(float balance) {
        System.out.println("\nYour Current Balance is $" + balance + "\n");
        //Your Current Balance is $520.36
    }

    private static void printOptions() {
        System.out.println("""
                Choose From the Following Options:
                    1. Display Balance
                    2. Deposit
                    3. Withdraw
                    4. Log Out
                """);

    }

    private static void logout() {
        System.out.println("\nLOGGED OUT");
        System.exit(0);
        //LOGGED OUT
    }

    private static float withdraw(float balance) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("\nAmount to Withdraw: $");
        float withdrawalAmount = Float.parseFloat(kbd.nextLine());
        if (withdrawalAmount < 0) {
            System.out.println("\ninvalid amount\n");
        } else if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.printf("\nYour New Balance is $%.2f" + "\n", balance);
        } else {
            System.out.println("\ninsufficient funds\n");
        }
        return balance;
        //Amount to Withdrawl: $ 20
        //Your New Balance is 520.36
    }

    private static float deposit(float balance) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("\nAmount to Deposit: $");
        float depositAmount = Float.parseFloat(kbd.nextLine());
        if (depositAmount >= 0) {
            balance += depositAmount;
            System.out.printf("\nYour New Balance is $%.2f" + "\n", balance);
        } else {
            System.out.println("\ninvalid amount\n");
        }
        return balance;
        //Amount to Deposit: $ 20
//Your New Balance is $540.36
    }


    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        float balance = getBalance();

        System.out.println("\nBalance: $" + balance + "\n");
        while (true) {
            printOptions();
            String option = kbd.nextLine();
            switch (option) {
                case "1" -> printBalance(balance);
                case "2" -> balance = deposit(balance);
                case "3" -> balance = withdraw(balance);
                case "4" -> logout();
                default -> System.out.println("invalid option");
            }
        }
    }


}
//Account Number:
//44567-5
//Password:
//mypassword
//
//Balance: $ 520.36
//
//Choose From the Following Options:
// 1. Display Balance
// 2. Deposit
// 3. Withdraw
// 4. Log Out
//
//1
//
//Your Current Balance is $520.36
//
//Choose From the Following Options:
// 1. Display Balance
// 2. Deposit
// 3. Withdraw
// 4. Log Out
//
//2
//
//Amount to Deposit: $ 20
//Your New Balance is $540.36
//
//Choose From the Following Options:
// 1. Display Balance
// 2. Deposit
// 3. Withdraw
// 4. Log Out
//
//3
//
//Amount to Withdrawl: $ 20
//Your New Balance is 520.36
//
//Choose From the Following Options:
// 1. Display Balance
// 2. Deposit
// 3. Withdraw
// 4. Log Out
//
//4
//
//LOGGED OUT
//Account Number:
//5
//Password:
//5
//Account Number:
//5
//Password:
//5
//Account Number:
//5
//Password:
//5
//LOCKED OUT.
//        String a = "44567-5 mypassword 520.36";
//        String b = "1234567-6 anotherpassword 48.20";
//        String c = "4321-0 betterpassword 96.74";
//iNotEsco — 03/15/2023 8:15 PM
//ERROR: INSUFFICIENT FUNDS TO PROCESS YOUR REQUEST!