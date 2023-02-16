package Homeworks;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.util.Scanner;

public class HW7_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of Month");
        int MonthOfYear = scan.nextInt();
        switch (MonthOfYear){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                 break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("The number you entered not count in any months.Please try any acceptable number which is month");
        }


    }
}
/*Write a program to accept a number from 1 to 12 and display name of the month. (Use switch case)
The code should ask user to enter a number. If it is not between 1 and 12 you should warn the user.*/