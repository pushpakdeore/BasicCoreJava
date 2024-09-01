package pushpak10Day5;

import java.util.Scanner;

public class java5PimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            if(num%i==0){
                if(isprime(i)){
                    System.out.println(i);
                }

            }
        }
    }
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }for(int i =2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
