package Homeworks;

import java.util.Scanner;

public class HW15_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();
        int Count = 0;
        for (int i = 0; i < Sentence.length() ; i++) {
            if (Sentence.charAt(i)== 'A' || Sentence.charAt(i)== 'a'){
                Count++;
            }
        }
        System.out.printf("This word has %d A(a) ",Count);
    }
}
/*Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Word");
                String Word = scan.nextLine();
                //int Length = ;
                int Count = 0;

                for (int i = 0; i <= Word.length()-1; i++) {
                if (Word.contains("A") || Word.contains("a")) {
                Count = Count+1;
                //i++;
                }
                }
                System.out.printf("%d\n",Count );*/


/*String word = "adaafsxcacvAbandanannsdnanAAJKNKLBLAAANAZIJOAnNANDAADAAANDLKALASAAnA";
int count = 0 ;
/*for (int i = 0; i < word.length() ; i++) {
    if (word.charAt(i) == 'A' || word.charAt(i) == 'a'){
        count++;
    }
}*/
//System.out.println("There are " + count + " 'a' or 'A' ");