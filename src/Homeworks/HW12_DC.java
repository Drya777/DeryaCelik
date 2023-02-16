package Homeworks;

import java.util.Scanner;

public class HW12_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        int SumEven=0;
        int SumOdd=0;
        for (int i = 0; i <=Number; i++) {
            if(i%2==0){
                 SumEven = SumEven+i;
            }else if (i%2==1){
                SumOdd = SumOdd+i;
            } else{
                System.out.println("invalid number");
            }
        }
        System.out.println("Sum of even number =" + SumEven);
        System.out.println("Sum of odd number =" + SumOdd);
    }
}
/* Write a code where user is asked to enter a number.
                Find the sum of all the even numbers between 0 to that number (included)
        Find the sum of all the odd numbers between 0 to that number (included)*/