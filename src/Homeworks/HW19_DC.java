package Homeworks;

import java.util.Scanner;

public class HW19_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String Word = scan.next();
        String NewWord = "";
        for (int i = 0; i < Word.length(); i++){
           if (!NewWord.contains("" +Word.charAt(i))){
               NewWord =NewWord+ Word.charAt(i);
           }
        }
        NewWord = NewWord.toUpperCase();
        System.out.println(NewWord);
    }
}



