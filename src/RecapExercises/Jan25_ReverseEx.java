package RecapExercises;

public class Jan25_ReverseEx {
    public static void main(String[] args) {
        String Sentence = "www.love.com";
        // Java love I

        String[] MySentenceArray = Sentence.split(".");
        //{"I", "love", "Java"}
        //  0      1       2
        // go from 2 down to 0
        // MySentenceArray.length = 3
        String os = "";
        for (int i = MySentenceArray.length - 1; i >= 0; i--) {
            // i = 2
            os = os + MySentenceArray[i] + ".";
            // System.out.print(MySentenceArray[i]+" ");
        }
// System.out.println("\n" + os);
        String osss = "";
        for (int i = os.length() - 2; i >= 0; i--) {
            osss = osss + os.charAt(i);
        }
        System.out.println("osss = " + osss);
    }
}