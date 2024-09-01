package pushpak10Day5;

import java.util.Scanner;

/*5. Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.*/
public class java6Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the divident :");
        int divident =sc.nextInt();
        System.out.print("Enter the divisor :");
        int divisor = sc.nextInt();

        if(divisor==0){
            System.out.println("Divisor cannot be Zero");
        }
        int quotient = divident/divisor;
        int remainder = divident%divisor;
        System.out.println("Qutient:"+quotient);
        System.out.println("remainder:"+remainder);

    }
}
