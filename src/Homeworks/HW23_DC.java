package Homeworks;

public class HW23_DC {
    public static void main(String[] args) {
        /*
         Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Find and print the minimum number in the given array
         */
        int [] MyArrayNum = {6,7,2,3,90,-2,-90,-122,96,35};
        int MinNumber = MyArrayNum[0];
        for (int i = 1; i < MyArrayNum.length; i++) {
           /*if( MyArrayNum[i] < MinNumber ){
              MinNumber = MyArrayNum[i];
           }*/
            if( MyArrayNum[i] < MinNumber ){

            }
        }
        System.out.printf("The min number of this array is %d",MinNumber);
    }
}
