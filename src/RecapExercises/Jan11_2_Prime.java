package RecapExercises;

import java.util.Scanner;

public class Jan11_2_Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int Numero = scan.nextInt();
        boolean Is_It_Prime = true;
        for (int i = 2; i <= Numero-1 ; i++) {
            int Remainder = Numero %i;
            if (Remainder==0){
                Is_It_Prime = false;
                break;
            }
            }
            if(Is_It_Prime ==true){
                System.out.println("This is a prime number");
            }else {
                System.out.println("This not a prime number");
            }



        }
    }
