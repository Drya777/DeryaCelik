package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW26_DC {
    public static void main(String[] args) {

        int [] MyArray = {2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(MyArray));
        System.out.println(" ");
        for (int i =0; i < MyArray.length; i++) {
            int Original = 0;
            int New = MyArray.length-1-i;
            int Temp  = MyArray [Original];
           MyArray [Original] = MyArray [New];
           MyArray [New] =Temp;
        }
        System.out.println(Arrays.toString(MyArray));
    }
}

       /*
        Write code where it shifts all the elements in array by one index and put the the first index at the end of the array
example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
         */
        /*
        Scanner
        Empty array
        for loop
        shift first number to the end
         */