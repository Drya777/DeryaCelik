package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW25_DC {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter for 5 employee salaries and store those salaries
Then find the average salary of those 5 employees
         */
        Scanner scan = new Scanner(System.in);
        int [] EmpSalaries = new int[5];
        int Total = 0;
        double EmployNum =0;
        double SalAverage =0;
        for (int i = 0; i <EmpSalaries.length ; i++) {
            System.out.println("Please enter a Salary");
             EmpSalaries [i] = scan.nextInt();
            Total = Total + EmpSalaries [i];
            EmployNum++;
        }
        System.out.println(Arrays.toString(EmpSalaries));
        SalAverage = Total / EmployNum;
        System.out.println("The Average is = "+ SalAverage);
    }
}
