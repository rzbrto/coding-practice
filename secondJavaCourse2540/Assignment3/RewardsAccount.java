package secondJavaCourse2540.Assignment3;

public class RewardsAccount extends StudentAccount {
    private double rewards;

    public RewardsAccount() {
        super();
    }

    public RewardsAccount(double balance) {
        super(balance);
        rewards = balance >= 100 ? 5 : 0;
    }
}
