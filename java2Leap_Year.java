package pushpak10Day5;

import java.util.Scanner;

/*2. Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.*/
public class java2Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if((year%4==0 &&year%100!=0)||(year%400==0)){
            System.out.println(year+": is leap year ");
        }else {
            System.out.println(year+" : is no");
        }
    }
}
