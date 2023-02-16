package RecapExercises;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Jan19_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int Number1= scan.nextInt();
        System.out.println("Please enter second number");
        int Number2 = scan.nextInt();
        int i = Number1;
        int Sum =0;
        while (i<=Number2){

            Sum=Sum+i;

            i++;
        }

    }
}
