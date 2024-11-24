import java.util.*;
public class generate_Parenthesis {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateHelper(result, "", 0, 0, n);
        return result;
    }
    static void generateHelper(List<String> result, String current, int open, int close, int max) {
        // If the current string is valid and complete, add it to the result
        //System.out.println(current);
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an opening parenthesis if we can
        if (open < max) {
            generateHelper(result, current + "(", open + 1, close, max);
        }

        // Add a closing parenthesis if it doesn't exceed the number of open parentheses
        if (close < open) {
            generateHelper(result, current + ")", open, close + 1, max);
        }
    }
    public static void main(String[] args) {
        int n = 3; // Number of pairs of parentheses
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }
}
