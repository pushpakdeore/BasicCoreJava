package pushpak10Day5;
/*3. Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.*/

import java.util.Scanner;

public class java3Poower_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if((a>0) &&(a&(a-1))==0){
            System.out.println(a+"is power of two");
        }
        else {
            System.out.println(a+" is not power two");
        }

    }
}
