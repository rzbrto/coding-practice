package newConcepts.recursion;

import java.util.Scanner;

public class Recursion1 {
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     *
     * @param n
     * @return if invalid n, -1
     */
    public static int getSumRecursion(int n) {
        if (n < 1){
            return -1;
        }
        if (n == 1) {
            return 1;
        } else {
            return n + getSumRecursion(n - 1);
        }
        ///return n == 1 ? 1 : n + getSumRecursion(n - 1);
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextInt();
        System.out.println(getSum(num));
        System.out.println(getSumRecursion(num));
    }
}
// get sum 1 + 2 + 3 + 4 + ... + n