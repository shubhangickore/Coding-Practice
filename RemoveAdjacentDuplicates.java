import java.util.*;

public class RemoveAdjacentDuplicates {
    public static String removeduplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "abbccd";
        System.out.println(removeduplicates(s));
    }
}
