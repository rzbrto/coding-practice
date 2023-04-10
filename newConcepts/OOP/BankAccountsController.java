package newConcepts.OOP;

import java.util.HashMap;
import java.util.UUID;

public class BankAccountsController {
    HashMap<UUID, BankAccount> accounts;
    HashMap<UUID, Person> people;
    public BankAccountsController(){
        accounts = new HashMap<>();
    }

    public void addNewBankAccount(Person person, int amountInCents) {
        BankAccount account = new BankAccount(amountInCents);
        accounts.put(account.getID(), account);
        person.addToListOfBanks(account.getID());
    }

    public BankAccount getBankAccount(UUID ID) {
        return accounts.get(ID);

    }
}
