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

        System.out.println(Arrays.toString(ans)); // that converts an array into a human-readable string.

    }
}

// - f condition runs first for each digit.
// - Return inside loop ends method immediately → no further code runs.
// - Else part runs only if digit == 9 → sets digit to 0, continues loop.
// - Code outside loop runs only if loop never returned (i.e., all digits were
// 9).
// - Braces {} group code for methods, loops, and conditions.
// - Variables declared inside method are local; declared outside are global.
// - Multiple ifs/functions → they run in order, top to bottom, but only the one
// whose condition is true executes.
// - Return keyword → ends the method right there.
// - Arrays.toString() → prints array contents in readable format [1, 2, 3].
