import java.util.*;

public class FirstUniqChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Firstuniqchar(s));
    }

    public static int Firstuniqchar(String s) {
        int freq[] = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

}

/*
 * Index calculation: c - 'a'
 * 
 * Characters in Java are stored as Unicode values (same as ASCII for English
 * letters).
 * 'a' has code 97, 'b' is 98, 'c' is 99, etc.
 * So c - 'a' gives you a 0-based index for each lowercase letter:
 * 'a' - 'a' = 0
 * 'b' - 'a' = 1
 * 'c' - 'a' = 2
 * 'z' - 'a' = 25
 */

/*
 * freq[c - 'a']++ increases the count for that letter.
 * 
 * Example with s = "abbc":
 * 
 * 'a' → freq[0]++ → freq[0] = 1
 * 
 * 'b' → freq[1]++ → freq[1] = 1
 * 
 * 'b' → freq[1]++ → freq[1] = 2
 */