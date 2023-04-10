package newConcepts.OOP;

import java.util.UUID;

public class Test {
    public static BankAccountsController bac = new BankAccountsController();
    public static void printPersonInfo(Person person) {
        System.out.println(person.toString());
        for (UUID ID : person.getListOfBanks()) {
            System.out.println(bac.getBankAccount(ID));
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("John", "Cena");
        Person person2 = new Person("Oliver Sykes");


        bac.addNewBankAccount(person1, 1000);
        bac.addNewBankAccount(person1, 4000);
        bac.addNewBankAccount(person2, 2000);
        printPersonInfo(person1);
        printPersonInfo(person2);
    }
}
