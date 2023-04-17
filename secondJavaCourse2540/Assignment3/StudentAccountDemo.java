package secondJavaCourse2540.Assignment3;

public class StudentAccountDemo {
    public static void main(String[] args) {
        StudentAccount studentAccount1 = new StudentAccount();
        System.out.println(studentAccount1);
        studentAccount1.setBalance(100);
        System.out.println(studentAccount1);
        studentAccount1.deposit(50);
        System.out.println(studentAccount1);
        RewardsAccount rewardsAccount1 = new RewardsAccount();
        System.out.println(rewardsAccount1);
    }
}
