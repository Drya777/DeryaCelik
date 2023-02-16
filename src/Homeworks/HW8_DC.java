package Homeworks;

import java.util.Scanner;

public class HW8_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers with entering spaces between each data");
        int Number1 = scan.nextInt();
        int Number2 = scan.nextInt();
        int Number3 = scan.nextInt();
        System.out.printf("Number1 = %d ,Number2 = %d ,Number3 = %d,",Number1 ,Number2 ,Number3 );

        boolean MaxNumber1 = (Number1>Number2) && (Number1>Number3);
        boolean MaxNumber2 = (Number2>Number1) && (Number2>Number3);
        boolean MaxNumber3 = (Number3>Number1) && (Number3>Number2);


        int MaxNumber =(MaxNumber1) ? Number1 :(MaxNumber2) ? Number2 : Number3;
        System.out.println();

        System.out.println("The Maximum number is " + MaxNumber);


    }
}
/*Write a program to find the largest number out of three numbers excepted from user.*/