package Homeworks;

import java.util.Scanner;

public class HW9_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Year to check it is leap year or not");
        int Year = scan.nextInt();
        String LeapYear = (Year % 4 ==0 && Year % 100 !=0 )  ? "This is a leap year" :(Year % 400 ==0 && Year % 100 ==0 ) ?"This is a leap year" :"This is not a leap year";

        System.out.println(LeapYear);
    }
}
/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year;
If the year can also be evenly divided by 100, it is not a leap year;
unless...
The year is also evenly divisible by 400. Then it is a leap year.

Example of leap years : 2000, 2020, 2024, and 2400
while 1800, 1900, 2100, 2021, 2023, 2200, 2300, and 2500 are not leap years.*/

/*int MaxNumber =(MaxNumber1) ? Number1 :(MaxNumber2) ? Number2 : Number3;
        System.out.println();*/
/*(Year % 100 ==0) ?"This is not a leap year" :*/
//String LeapYear = (Year % 100 ==0) ? "This is not a leap year" : (Year % 4 ==0 && Year % 400 ==0)  ? "This is a leap year" : "This is not a leap year";
// String LeapYear = (Year % 4 ==0 && Year % 400 ==0)  ? "This is a leap year" :(Year % 100 ==0 || Year % 100 !=0 ) ?"This is not a leap year" :"This is a leap year";