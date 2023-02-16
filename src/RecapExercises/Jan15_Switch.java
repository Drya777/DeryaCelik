package RecapExercises;

import java.util.Scanner;

public class Jan15_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Age");
        int Age = scan.nextInt();

        switch (Age){
            case 16:
                System.out.println("You cannot vote");
                break;
            case 18:
                System.out.println("You can vote");
                break;
            case 65:
                System.out.println("You are a senior citizen");
                break;
            default:
                System.out.println("Please enter a valid Age");
        }
    }
}
