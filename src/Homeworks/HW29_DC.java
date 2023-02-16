package Homeworks;

public class HW29_DC {
    public static void main(String[] args) {

        String Word1 ="JavaClAss";
        String Word2 ="javaclaSs";
        System.out.println(EqualOrNot(Word1,Word2));
        System.out.println("------------");
        String Word3 = "IsJavaGettingHarder";
        String Word4 = "YesItIs";
        System.out.println(EqualOrNot(Word3,Word4));
    }
    public static boolean EqualOrNot(String Par1,String Par2){

     return Par1.equalsIgnoreCase(Par2);
    }
    //Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal and returns false when they are not equal.
}
