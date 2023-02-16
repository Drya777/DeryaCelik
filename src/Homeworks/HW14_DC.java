package Homeworks;

import java.util.Scanner;

public class HW14_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        int SqrNum=0;
        for (int i = 0; i < Number; i++) {
            SqrNum = i*i;
            System.out.println(i +" * "+ i + " = " + SqrNum);
            /*Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int number = scan.nextInt();

for (int i = 0; i <= number ; i++) {
    System.out.printf("%d * %d = %d\n", i , number , i * number);
}*/
        }
    }
}
       /*Write a code where user is asked to enter a number:
Calculate the square of all the numbers from 0 to given number and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)*/