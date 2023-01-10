
public class SplitAnyString {
    /**
     * this code will take a String and return the same sting reversed
     * 
     * @param args: the main method argument
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String inputString = "Reverse me if you can";
        String delimiter = " ";

        System.out.print(reverseString(inputString, delimiter));
    }

    /**
     * this method will return a reversed String.
     * 
     * @param str :      the Input String that will be reversed
     * @param delimiter : The regex of the split method 
     * @return : the reversed String
     */
    public static String reverseString(String str, String delimiter) {
        if (str == null || delimiter == null) {
            System.out.print("INPUT!!!");
            return null;
        } else if (str == "" && delimiter == "") {
            System.out.print("Empty INPUT!!!");
            return "";
        }
        String[] words = str.split(delimiter);
        StringBuilder reversedString = new StringBuilder();
        for (int index = words.length - 1; index >= 0; index--) {
            reversedString.append(words[index]);
            if (index > 0) {
                reversedString.append(delimiter);
            }
        }
        return reversedString.toString();
    }
}
