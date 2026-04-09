import java.util.*;

public class LengthOfLastWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(LenofLastWord(s));

    }

    public static int LenofLastWord(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}
