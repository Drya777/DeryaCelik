package Homeworks;

import java.util.Arrays;

public class HW30_DC {
    public static void main(String[] args) {
        int [] MyArray = {11,-2,9,-10,13,33,22,7};
        ArraySort(MyArray);
        System.out.println(Arrays.toString(MyArray));
    }
    public static void ArraySort(int [] Param){
        Arrays.sort(Param);
    }
}
//Write a method where it takes array of integers and returns the sorted version of that array