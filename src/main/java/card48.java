
public class card48 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sentence = "this is a sentence";
        reverse(sentence);

    }

    public static void reverse(String sentence) {
        char[] letters = sentence.toCharArray();//
        System.out.println(sentence);
        for (int index = letters.length - 1; index >= 0; index--) {
            System.out.print(letters[index]);
        }
        
    }

}
