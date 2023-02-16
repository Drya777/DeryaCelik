package RecapExercises;

import java.util.Scanner;

public class Feb1_PalindromeMethod {
    public static void main(String[] args) {
        /*

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

        //I need to get all words by split
        String [] Words = Sentence.split(" ");

        //For each
        //I need to check if it is palindrome

        for (String MyWord : Words){
            boolean isPalindrome =CheckPalindrome(MyWord);
            System.out.println("is "+MyWord+" Palindrome :" +isPalindrome);
        }


    }
    public static boolean CheckPalindrome (String Word){
        //Check if it is palindrome
        String Reversed = "";
        for (int i = Word.length()-1; i >=0 ; i--){
            Reversed = Reversed + Word.charAt(i);
            /*
            for(int i =0 ; i<Word.length ;i++ ){
            Reversed=Word.charAt(i)+Reversed;
            }
             */

        }
        //boolean isItPalindrome=Reversed.equalsIgnoreCase(Word);
        //return IsItPalindrome;
        return Reversed.equalsIgnoreCase(Word);
    }

}
