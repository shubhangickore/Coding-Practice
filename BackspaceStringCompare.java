import java.util.*;

public class BackspaceStringCompare {

    public static void main(String args[]) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspacecompare(s, t));

    }

    private static String Build(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }

        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static boolean backspacecompare(String s, String t) {
        return Build(s).equals(Build(t));
    }
}