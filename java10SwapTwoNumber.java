package pushpak10Day5;
import java.util.Scanner;

public class java10SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Swap using a temporary variable");
        System.out.println("2. Swap using arithmetic operations");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                swapUsingTempVariable();
                break;
            case 2:
                swapUsingArithmeticOperations();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to swap using a temporary variable
    public static void swapUsingTempVariable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }

    // Method to swap using arithmetic operations
    public static void swapUsingArithmeticOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}

