package RecapExercises;

import java.util.Scanner;

public class Jan18_WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter Number1");
        int Start= scan.nextInt();
        System.out.println("Please enter Number2");
        int End = scan.nextInt();
        int Count=0;
        for (int i = Start; i <=End; i++) {
            if (i%3==0) {
                System.out.println(i + " can be divide by 3");
                Count = Count + 1;
            }
        }
        System.out.println("Count = " + Count);
    }
}
