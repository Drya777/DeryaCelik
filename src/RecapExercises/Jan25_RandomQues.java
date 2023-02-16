package RecapExercises;

public class Jan25_RandomQues {
    public static void main(String[] args) {
        //create a java logic that will print odd and even numbers
        // count of even and odd
        //also it will print sum of odd numbers and sum of even numbers
        int  [] num = {1,2,3,4,5,6,7,8,9}; //5 odd  4 even
        int oddcount =0;
        int evencount = 0;

        for (int numint : num){

            int hh = (numint % 2 == 0) ? evencount++ : oddcount++;
        }
        System.out.println("evencount = " + evencount);
        System.out.println("oddcount = " + oddcount);


        int totodd = 0;
        int toteven = 0;


        for (int i = 0; i <= num.length-1 ; i++) {
            int remain = num[i] % 2;
            if (remain!=0){
                totodd = totodd+num[i];
            } else if (remain ==0){
                toteven = toteven+num[i];
            }
        }
        System.out.println("toteven = " + toteven);
        System.out.println("totodd = " + totodd);
    }
}
