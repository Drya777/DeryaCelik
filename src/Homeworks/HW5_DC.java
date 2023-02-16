package Homeworks;

    import java.util.Scanner;

    public class HW5_DC {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter First Name, Last name and Credit Score with entering spaces between each data");
            String FirstName = scan.next();
            String LastName = scan.next();
            int CreditScore = scan.nextInt();

            if ( CreditScore < 500){
                System.out.println(FirstName +" "+ LastName + " has a Bad Credit Score Score");

            } else if (500 <= CreditScore && CreditScore <= 699) {
                System.out.println(FirstName +" "+ LastName + " has an Average Credit Score Score");

            } else if (700 <= CreditScore && CreditScore <= 750){
                System.out.println(FirstName +" "+ LastName + " has a Good Credit Score");
            } else if(750 < CreditScore){
                System.out.println(FirstName +" "+ LastName + " has a Great Credit Score!");
            }
        }
    }

       /*write a code where it check the credit score for a person.
The code should ask First Name, Last name and Credit Score of a person. (Using Scanner)
If a person have a credit score less then 500 == > print "<person First Name>  <Person Last Name> has Bad Credit Score"
if a person have credit between 500-699 ==> print "<person First Name>  <Person Last Name> has Average Credit Score"
if a person have credit between 700-750 ==> print "<person First Name>  <Person Last Name> has Good Credit Score"
if a person have credit score greater than 750==> print "<person First Name>  <Person Last Name> has Great Credit Score"*/