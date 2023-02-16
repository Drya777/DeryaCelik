package Extranotesfromfriends;

import java.util.Scanner;

public class Canan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=1;
        int total = 0;
        do {
            System.out.println("Please enter number: ");
            number = scan.nextInt();
            if (number % 2 == 1) {
                total = total + number;
                System.out.println("Total : " + total);
            }
        } while (number >= 0);
        //System.out.println("Total : " + total);
    }
}
