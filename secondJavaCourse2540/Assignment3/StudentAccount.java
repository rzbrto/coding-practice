package secondJavaCourse2540.Assignment3;

public class StudentAccount {
    private long accountNumber;
    private double balance;
    public static int counter = 0;

    public StudentAccount() {
        balance = 0;
        this.accountNumber = ++counter;
    }

    public StudentAccount(double balance) {
        this.balance = balance;
        this.accountNumber = ++counter;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCounter() {
        return counter;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountToDeposit) {
        if (amountToDeposit >= 0) {
            this.balance = balance + amountToDeposit;
        } else {
            System.out.println("Must return a positive amount.");
        }
    }

    public void charge(double amountToCharge) {
        if (amountToCharge > balance) {
            System.out.println("Declined");
        } else if (amountToCharge >= 0) {
            this.balance = balance + amountToCharge;
        } else {
            System.out.println("Must return a positive amount.");
        }
    }

    @Override
    public String toString() {
        return """
                Account Number:  %s
                Balance:        $%.2f
                """.formatted(accountNumber, balance);
    }
}
