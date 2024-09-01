package pushpak10Day5;

import java.util.Scanner;
import java.util.Scanner;

public class java8Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter a single alphabet character.");
            return;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

}

