package RecapExercises;

import java.util.Scanner;

public class Jan10_1 {
    public static void main(String[] args) {
       /* //Write a program that will print your name 5 times. (Please use for loop logic);
        String Name = "Derya";
        for (int i = 0; i < 5; i++) {
            System.out.println(Name);*/
        // write a program that will print numbers from 15 to 5 as ascending. Please use for loop
         //Expected output: 15 14 13 12 11 10 9 8 7 6 5

        /*for (int i = 15; i >= 5 ; i--) {

            System.out.println(i);
    }*/
        //Write a program that will print count of the odd numbers from 0 to 20 Please use foor loop and if statment.
      // note: to check odd number =>  number %2 !=0 === number %2 =1;

       /* for (int i = 0; i < 20; i = i + 2) {
            System.out.println(i);}*/
//Write a program that will print sum of the even numbers between 0-20 is* include . Please use for loop and if statement

        /*for (int i = 0; i < 20 ; i = i +2) {
            if (i % 2 == 0){
                System.out.println(i =);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = scan.nextLine();

              //String i = scan.nextLine();
        for (int i = 0; i < 5; i++) {

            if (Name.contains("a")){
                
            System.out.println(Name);
            } else{
                System.out.println("There is no letter a inside that name");

                }

        }
         }
            }







