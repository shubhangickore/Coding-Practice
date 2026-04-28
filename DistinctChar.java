import java.util.*;

public class DistinctChar { // Approach: Time: O(n) | Space: O(1) — at most 256 chars
                            // LinkedHashSet preserves order + gives uniqueness in one shot.
    public static void printDistinct(String s) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            seen.add(c);
        }

        for (char c : seen) {
            System.out.println(c + "");
        }

    }

    public static void main(String args[]) {
        System.out.println("Programming");
    }

}
