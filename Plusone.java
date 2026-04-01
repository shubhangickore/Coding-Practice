import java.util.*;

public class Plusone {

    public static int[] plusone(int digits[]) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // it increments value not index
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String args[]) {
        int[] digits = { 1, 2, 3 };
        int ans[] = plusone(digits);

        System.out.println(Arrays.toString(ans));
    }
}