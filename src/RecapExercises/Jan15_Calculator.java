package RecapExercises;

import java.util.Scanner;

public class Jan15_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Number1");
        int Number1 = scan.nextInt();
        System.out.println("Please enter Number2");
        int Number2 = scan.nextInt();

        System.out.println("Please choose the operation :\n1 for Multiplication \n2 for division \n3 for addition \n4 for subtraction \n5 for mod");
        int Operation = scan.nextInt();//bunu unutma unutma

        switch (Operation){
            case 1:
                System.out.printf("The result of division is %d,",Number1*Number2);
                break;
            case 2:
                System.out.printf("The result multiplication is %d,",Number1/Number2);
                break;
            case 3:
                System.out.printf("The result addition is %d,",Number1+Number2);
                break;
            case 4:
                System.out.printf("The result subtraction is %d,",Number1-Number2);
                break;
            case 5:
                System.out.printf("The result of mod is %d,",Number1%Number2);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
