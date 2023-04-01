package firstJavaCourse.Assignment10;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter a 10-digit telephone number: ");
        String phoneNumber = kbd.nextLine();
        int[] freq = new int[10];

        for (char c : phoneNumber.toCharArray()) {
            if (c >= '0' && c <= '9') {
                freq[c - '0'] += 1;
            }
        }

        System.out.println("The following is the number of times each digit appears:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + freq[i]);
        }
    }
}
////Please enter a 10-digit telephone number: 2528643866
////
////The following is the number of times each digit appears:
//0 - 0
//1 - 0
//2 - 2
//3 - 1
//4 - 1
//5 - 1
//6 - 3
//7 - 0
//8 - 2
//9 - 0
//Please enter a 10-digit telephone number: (252)864-3866
//
//The following is the number of times each digit appears:
//0 - 0
//1 - 0
//2 - 2
//3 - 1
//4 - 1
//5 - 1
//6 - 3
//7 - 0
//8 - 2
//9 - 0