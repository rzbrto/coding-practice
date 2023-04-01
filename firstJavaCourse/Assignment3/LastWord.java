package firstJavaCourse.Assignment3;

import java.util.Scanner;

public class LastWord {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = kbd.nextLine();

        System.out.println("The last word in your sentence is:\n" + input.substring(input.lastIndexOf(" ") + 1));

    }
}
//Enter a sentence:
//Hi, my name is Jason
//The last word in your sentence is:
//Jason