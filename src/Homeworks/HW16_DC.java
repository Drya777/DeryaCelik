package Homeworks;

import java.util.Scanner;

public class HW16_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string to checks if it is Palindrome");
        String Word= scan.next();
        String Reverse = "";
        for (int i = Word.length()-1; i >=0 ; i--) {
             Reverse = Reverse + Word.charAt(i);
        }
        System.out.println(Reverse.toLowerCase() + " is reverse of "+ Word.toUpperCase());
            if(Word.equalsIgnoreCase(Reverse)){
                System.out.println(Word+" is a Palindrome");
            }else{
                System.out.println(Word+" is not a Palindrome");
        }
    }
}
       /*Write a code where user is being asked to enter a String and that checks if the String is Palindrome
PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar. (Java, or Hayri or Cat are not palindrome)
(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together*/

        /*
        madam
        racecar
         */