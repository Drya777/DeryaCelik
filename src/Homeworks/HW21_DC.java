package Homeworks;

import java.util.Scanner;

public class HW21_DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the web site name");
        String WebSiteName = scan.nextLine();
        int charlink1 = WebSiteName.indexOf(".");
        int charlink2 = WebSiteName.indexOf(".",charlink1+1);
        String RevPart1 = "";
        String RevPart2 = "";
        String RevPart3 = "";

        for (int i = charlink1-1; i >=0 ; i--) {
            String rev1 = RevPart1 + WebSiteName.charAt(i);
            System.out.print(rev1);

        }
        System.out.print(".");
        for (int i = charlink2-1; i >=charlink1 ; i--) {
            String rev2 = RevPart2 + WebSiteName.charAt(i);
            System.out.print(rev2);
        }
        System.out.print("");
        for (int i = WebSiteName.length()-1; i >charlink2 ; i--) {
            String rev3 = RevPart3 + WebSiteName.charAt(i);
            System.out.print(rev3);
        }
    }
//Write a program to reverse individual words in a web url, where each word may be delimited by a dot. Like www.google.com should become www.elgoog.moc
}