package RecapExercises;

public class Jan8_2 {
    public static void main(String[] args) {
        String A = "Do your homeworks";
        String B = "AT"; //String memory
        String C =new String("AT");//Heap memory ,original memory
        String c =new String("AT");
        String D ="bee";
        String E = "aT";
        String F = " ";

       // System.out.println(B==C);
        // System.out.println(c==C);
        //System.out.println(B.equals(C));
        System.out.println(B.equalsIgnoreCase(E));
        boolean jh = B.equalsIgnoreCase(E);
        System.out.println(jh);
        System.out.println(A.charAt(16));
        System.out.println(A.length());
        System.out.println(A.length()-1);
        System.out.println(A.indexOf("o"));
        System.out.println(A+""+D);
        System.out.println(A.concat(" "+D));
        System.out.println(D.contains("k"));


    }
}
