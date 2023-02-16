package RecapExercises;

import java.util.Scanner;

public class Jan8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name and surname");
        String Name = scan.next();
        String Surname = scan.next();
        int Age = 51;
        double Salary = 4589.95;
        System.out.printf(" %s,\n %s,\nAge %d,\n Salary %f");

    }
}
