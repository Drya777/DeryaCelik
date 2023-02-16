package Homeworks;

public class HW28_DC {
    public static void main(String[] args) {
        String Sentence = "hello my name is Alisan.       i am 30 years old.  i live in Toronto.   I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";
        String [] NewSentence = Sentence.split("\\.");
        //System.out.println(Arrays.toString(NewSentence).trim());
        String AtArabasi="";
        int Length = 0;
        for (String it : NewSentence){

            AtArabasi= AtArabasi+( it.trim().toLowerCase()+".");

            Length = it.trim().length();
            System.out.println("Length of= "+it+" is ----->>" + Length);

        }
        System.out.println(AtArabasi);
    }
}
