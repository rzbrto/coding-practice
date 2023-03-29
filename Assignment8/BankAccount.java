package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BankAccount {

    public static String checkID(String accountNumber, String password) {
        String a = "44567-5 mypassword 520.36";
        String b = "1234567-6 anotherpassword 48.20";
        String c = "4321-0 betterpassword 96.74";

        String userCreds = String.join(" ", accountNumber, password);
        if (userCreds.equals(a.substring(0,a.lastIndexOf(" ")))){
            return a.substring(a.lastIndexOf(" ") + 1);
        }
        if (userCreds.equals(b.substring(0,b.lastIndexOf(" ")))){
            return b.substring(b.lastIndexOf(" ") + 1);
        }
        if (userCreds.equals(c.substring(0,c.lastIndexOf(" ")))) {
            return c.substring(c.lastIndexOf(" ") + 1);
        }
        return "wrong";
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String balance;
        int attempts = 1;
        do {
            if(attempts > 3) {
                System.exit(0);
            }
            System.out.println("Account Number:");
            String accountNumber = kbd.nextLine();
            System.out.println("Password:");
            String password = kbd.nextLine();
            balance = checkID(accountNumber, password);
            attempts ++;
        } while (balance.equals("wrong"));

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