package StudyHallExamples;

import java.util.Scanner;

public class StudyHall_Dec20 {
    /*
Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 */
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int number ;
            int evenSum=0;
            int oddSum=0;
            char choice;
            do{
                System.out.println("Enter a number");
                number=scanner.nextInt();

                if(number%2==0){
                    evenSum+=number;
                }else {
                    oddSum+=number;
                }
                System.out.println("Do you want to continue y/n");
                choice=scanner.next().charAt(0);
            }
            while(choice=='y'||choice=='Y');

            System.out.println("Even Numbers : "+evenSum);
            System.out.println("Odd Numbers : "+oddSum);

        }
}
