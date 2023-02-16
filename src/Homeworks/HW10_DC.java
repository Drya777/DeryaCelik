package Homeworks;

import java.util.Scanner;
public class HW10_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String Name = scan.nextLine();
        Name = Name.toUpperCase();
        if(Name.startsWith("A") && Name.endsWith("L")){
            System.out.println(Name.replace("A","B"));
        }else{
            System.out.println("Please try another name");
        }
       }
    }
 /*Write a code where user is being asked to enter a name:
        if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result*/
