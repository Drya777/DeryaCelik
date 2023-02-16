package RecapExercises;

import java.util.Scanner;

public class Jan11_4_Fact {
    public static void main(String[] args) {

        /*int first = 12;
        for (int j = 11; j >=5; j--) {
            first = first*j;
        }
        System.out.println(first);*/


       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int Number = scan.nextInt();
        int fac = 1;
        for (int i = 1 ; i<=Number ; i++) {
            fac = fac *i;

        }
        System.out.println("Factorial of Number:" +fac);
    }

}
