package Hard.CheckBrackets;
import java.util.LinkedList;


public class ValidBrackers {
    public static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.add(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty() || !isMatching(stack.removeLast(), bracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
public static boolean isMatching(char open, char close){
        return (open == '(' && close == ')' || open == '[' && close == ']' || open == '{' && close == '}');
}

}
