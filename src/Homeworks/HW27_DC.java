package Homeworks;

import java.util.Scanner;

public class HW27_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String Word = scan.nextLine();
        int Count = 0;
        for (int i = 0; i <= Word.length() - 3; i++) {
            String Parts = Word.substring(i, i + 3);
            boolean IsItPalindrom = CheckPartsPalindrom(Parts);
            if (IsItPalindrom == true) {
                Count++;
                System.out.print(Parts + ", ");
            }
        }
        System.out.printf("there are %d Palindrome three Char substring", Count);
    }

    public static boolean CheckPartsPalindrom(String Part) {
        String ReversedPart = "";
        for (int i = Part.length() - 1; i >= 0; i--) {
            ReversedPart = ReversedPart + Part.charAt(i);
        }
        return ReversedPart.equalsIgnoreCase(Part);
    }
}
        /*
        Write a code where user is being asked to enter a word, find home many 3 character palindrome substrings are in the given Word and print each one of them ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)
         */
        /*
        Scanner

         */