package RecapExercises;

import java.util.Scanner;

public class Jan11_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int Numero = scan.nextInt();
        boolean IsItPrime =true;
        for (int i = 2; i <= Numero-1; i++) {
            int Remainder = Numero %i;
            if(Remainder==0){
                IsItPrime =false;
                break;
            }
            }
            if (IsItPrime == true){
                System.out.println("This is a prime number");
            }else{
                System.out.println("This is not a prime number");
            }


    }
}
