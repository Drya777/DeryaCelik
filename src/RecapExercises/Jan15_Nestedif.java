package RecapExercises;

import java.util.Scanner;

public class Jan15_Nestedif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        if (Number == 0){
            System.out.println("Number = " + Number);
        } else if (Number %2 ==0) {//even numbers
              if(Number<50){
                  Number = Number *2;
                  System.out.println("Number = " + Number);
              }else {
                  Number = Number *3;
                  System.out.println("Number = " + Number);
              }
        }else{//odd number
            Number =(Number<70) ? Number*3 :Number/2;
            System.out.println("Number = " + Number);
        }
    }
}
