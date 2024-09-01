package pushpak10Day5;

import java.util.Scanner;

public class java7Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check even or odd");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+"even number");
        }else{
            System.out.println(num+"odd number");

        }
    }
}
