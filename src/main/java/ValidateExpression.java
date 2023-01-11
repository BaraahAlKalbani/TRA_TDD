import java.util.Stack;

public class ValidateExpression {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String expString = "";
        boolean exprValidation = false;
        try {
            exprValidation = scoop(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(expString + "  <=-=-=> is Valid: " + exprValidation + "\n");
    }

    public static boolean scoop(String expression) {
        if (expression == null) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        char[] character = expression.toCharArray();
        // char c is for each element in character
        char c;
        for (int index = 0; index < expression.length(); index++) {
            c = character[index];
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);

            } else if (c == ')' || c == ']' || c == '}') {
                if (brackets.isEmpty()) {
                    return false;
                }

                char openBracket = brackets.pop();

                if ((c == ')' && openBracket != '(') || (c == ']' && openBracket != '[')
                        || (c == '}' && openBracket != '{')) {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
