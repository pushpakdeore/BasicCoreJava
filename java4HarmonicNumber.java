package pushpak10Day5;
import java.util.Scanner;
/*4. Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

public class java4HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N must be greater than 0.");
            return;
        }

        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);

        scanner.close();
    }
}
        

