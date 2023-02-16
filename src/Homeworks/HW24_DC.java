package Homeworks;

public class HW24_DC {
    public static void main(String[] args) {
        /*
        write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3
         */
        int [] ArrayDiv = {90,34,23,87,45,36,98};
        for (int i =0; i <ArrayDiv.length ; i ++ ){
            if( ArrayDiv[i]%2==0 || ArrayDiv[i]%3==0 ){
                System.out.print(ArrayDiv[i] + " ");
            }
        }
        System.out.println("\nThese numbers can divide by 2 or 3");
    }
}
