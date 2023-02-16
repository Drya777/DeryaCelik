package Homeworks;

import java.util.Scanner;
public class HW11_DC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

              if ((Sentence.startsWith("B") || Sentence.startsWith("b")) && (Sentence.endsWith("E") || Sentence.endsWith("e")) && (Sentence.contains("A") || Sentence.contains("a"))){

                 Sentence = Sentence.replace(Sentence.charAt(2),'G');

                  System.out.println((Sentence.replace(Sentence.charAt(4),'G')));

              }else {
                  System.out.println("Please try with another sentence");
              }
              /*package Homework2;

import java.util.Scanner;
//banane
public class Homework11 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        if ((sentence.charAt(0)=='b' || sentence.charAt(0)=='B') && (sentence.charAt(sentence.length()-1)=='E' || sentence.charAt(sentence.length()-1)=='e') && (sentence.contains("A") || sentence.contains("a"))){
            String newName = sentence.substring(0,1)+'G'+ sentence.substring(2,3)+'G'+sentence.substring(4);
            System.out.println(newName);

        }
    }
}*/
        }
}

 /*Write a Code where user is being asked to enter a sentence
if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a" replace second and fourth characters with "G"*/


