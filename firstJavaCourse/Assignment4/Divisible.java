package firstJavaCourse.Assignment4;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int firstInteger = kbd.nextInt();
        System.out.println("Enter another integer: ");
        int secondInteger = kbd.nextInt();

        if (firstInteger % secondInteger == 0) {
            System.out.printf("%d is divisible by %d", firstInteger, secondInteger);
        } else {
            System.out.printf("%d is not divisible by %d", firstInteger, secondInteger);
        }
    }
}
//Enter an integer: 5
//Enter another integer: 3
//5 is not divisible by 3
