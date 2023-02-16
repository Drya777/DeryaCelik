package RecapExercises;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ... Each number, starting with the third, adheres to the prescribed formula.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        /*
        Number1+Number2 =0+1
                        =1+2
                        =2+3
         */
        int Fibo = 0;
        int Number1 =0;
        int Number2 =1;
        System.out.println(Number1);
        System.out.println(Number2);
        for (int i = 2; i <Number ; i++) {
            Fibo = Number1 + Number2;
            Number1=Number2;
            Number2=Fibo;
            System.out.println("" +Fibo);

        }

    }
}
