package newConcepts.OOP;

import java.util.UUID;

public class BankAccount {
    private final UUID ID;
    private int amountInCents;
    private boolean locked;

    public BankAccount(int amountInCents) {
        this.amountInCents = amountInCents;
        this.ID = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return """
                Bank Account ID: %s
                Amount:          $%.2f
                """.formatted(ID.toString(), amountInCents / 100f);
    }

    public int getAmountInCents() {
        return amountInCents;
    }

    public UUID getID() {
        return ID;
    }
}
