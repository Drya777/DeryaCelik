package RecapExercises;

public class ReverseWithArray {
    public static void main(String[] args) {
        String Example = "This Is An Example";

        char [] Charforexample = Example.toCharArray();


        char[] Reverse = new char [Example.length()];

        for (int i = 0; i <=Example.length()-1 ; i++) {
            Reverse[i]= Charforexample[Example.length()-1-i];
            System.out.print(Reverse[i]);
        }
    }
}
