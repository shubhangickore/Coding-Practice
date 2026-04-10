import java.util.*;

public class Missingno {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int expectedsum = n * (n + 1) / 2; // t gives the sum of the first n natural numbers.So expectedsum is the sum
                                           // we should get if no number was missing.
        int actualsum = 0;

        for (int num : nums) {// this loop is a clean way to traverse an array and perform an operation (like
                              // summing) on each element without needing an index variable
            actualsum += num; // return the total element sum
        }

        System.out.println(expectedsum - actualsum);

    }
}