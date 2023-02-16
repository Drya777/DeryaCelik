package Homeworks;

import java.util.Scanner;

public class HW17_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        int SumOdd = 0;
        for (int i = 1; i <= Number ; i = i+2) {
            if(i==9 ||i==11 || i==23 || i==35){
                continue;
            }
                SumOdd = SumOdd + i;
        }
        System.out.printf("The total of odd numbers is = %d",SumOdd);
    }
}
