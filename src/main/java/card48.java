import java.util.ArrayList;

public class card48 {
/**
 * this method will reverse a String and display it
 * @param args
 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sentence = "this is a sentence";
        
        System.out.print(reverse(sentence));

    }

    public static String reverse(String sentence) {
        if (sentence==null) {
            return null;
        }
        char[] letters = sentence.toCharArray();
        char[] reverseLetters = new char[letters.length];
        
        for (int index = letters.length - 1, reverseindex=0; index >= 0; index--,reverseindex++) {
            reverseLetters[reverseindex]=letters[index];
        }
        String reverseString=new String(reverseLetters);
        return reverseString;
        
    }

}
