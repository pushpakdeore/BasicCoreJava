package pushpak10Day5;
/*1. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
        heads
c. O/P -> Percentage of Head vs Tails*/

import java.util.Scanner;
import java.util.Random;

public class java1Flip_coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();

        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < flips; i++) {

            if (random.nextDouble() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = ((double) headsCount / flips) * 100;
        double tailsPercentage = ((double) tailsCount / flips) * 100;

        System.out.println("Heads: " + headsCount + " times (" + String.format("%.2f", headsPercentage) + "%)");
        System.out.println("Tails: " + tailsCount + " times (" + String.format("%.2f", tailsPercentage) + "%)");
    }
}
