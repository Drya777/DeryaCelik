package Homeworks;

import java.util.Scanner;

public class HW22_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Number ");
        int Num = scan.nextInt();
        int OriginalNumber=0;
        int Digit=0;
        int CubeSum = 0;
        OriginalNumber = Num;

        while (Num !=0){
            Digit = Num %10;
            CubeSum += Math.pow( Digit, 3);
            Num /=10;
        }
        if (CubeSum == OriginalNumber){
            System.out.printf("%d is an Armstrong number",OriginalNumber);
        }else {
            System.out.printf("%d is not an Armstrong number",OriginalNumber);
        }
    }
}
/*
A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
Write a program to check given number is an Armstrong number or not
 */