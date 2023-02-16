package RecapExercises;

import java.util.Scanner;

public class Jan31_flipEndChars {
    public static void main(String[] args) {
        /*

    //5- Create a method that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
    //If the length of the string is less than two, return "Incompatible.".
    //If the first and last characters are the same, return "Two's a pair.".
    //Examples
    //flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
    //flipEndChars("ada") ➞ "Two's a pair."
    //flipEndChars("Ada") ➞ "adA"
    //flipEndChars("z") ➞ "Incompatible."
         */


        //5- Create a method that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
        //If the length of the string is less than two, return "Incompatible.".
        //If the first and last characters are the same, return "Two's a pair.".
        //Examples
        //flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
        //flipEndChars("ada") ➞ "Two's a pair."
        //flipEndChars("Ada") ➞ "adA"
        //flipEndChars("z") ➞ "Incompatible."
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your sentence");
        String k = scan.nextLine();
        Swap(k);
    }

    public static String Swap(String Last) {
        for (int i = 0; i < Last.length(); i++) {
            if (Last.length() < 2) {
                System.out.println("Incompatible.");
                break;
            } else if (Last.charAt(0) == Last.charAt(Last.length() - 1)) {
                System.out.println("Two's a pair.");
                break;
            } else if (Last.length() >= 2) {
                char First = Last.charAt(Last.length() - 1);
                char End = Last.charAt(0);

                String Sentence = "";
                for (int j = 1; j < Last.length() - 1; j++) {
                    Sentence = Sentence + Last.charAt(j);
                }
                System.out.println(First + Sentence + End);
                break;

            }
        }
        return Last;
    }
}
