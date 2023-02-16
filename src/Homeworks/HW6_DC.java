package Homeworks;

import java.util.Scanner;

public class HW6_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your FullName, Height in inches and Weight in lb with entering spaces between each data");

        String FirstName = scan.next();
        String LastName = scan.next();
        double Height = scan.nextDouble();
        double Weight = scan.nextDouble();


        String Military  = ((Height >= 67.00) && (Weight >= 140.00 && Weight <=250.00 )) ? " is eligible to join military":" is NOT eligible to join military" ;
        System.out.println( FirstName +" " +LastName + Military );



    }
}
       /* Write a code where it checks if a person is eligible to join military.
The code should ask person name, height, and weight. (Using Scanner)
In order for a person to join military, person should have height of 67 inches or more and have weight between 140 - 250 lb.
if person is eligible to join than ==> print "<Person Name> is eligible to join military"
if not ==> print <Person Name> is NOT eligible to join military" */
