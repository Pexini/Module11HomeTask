package Hard.CheckBrackets;
import java.util.LinkedList;
import java.util.Set;


public class ValidBrackers {
    private static final Set LEFT_Brsckers = Set.of('(', '[', '{');
    private static final Set RIGHT_Brsckers = Set.of(')', ']', '}');


    public static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char bracket : s.toCharArray()) {
            if (LEFT_Brsckers.contains(bracket)) {
                stack.add(bracket);
            } else if (RIGHT_Brsckers.contains(bracket)) {
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
