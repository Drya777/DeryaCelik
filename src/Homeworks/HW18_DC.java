package Homeworks;

import java.util.Scanner;

public class HW18_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        int Remainder=0;
        while (Number>0){
            Remainder = Number % 10;
            System.out.print(Remainder);
            Number = Number/10;
        }
    }
}
