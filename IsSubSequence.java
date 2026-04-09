import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Check if s is subsequence of t
        boolean result = isSubsequence(s, t);

        // Output
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                // If characters match, move both pointers
                i++;
            }
            // Always move j forward
            j++;
        }

        // If i reached end of s, all characters matched
        return i == s.length();
    }
}
