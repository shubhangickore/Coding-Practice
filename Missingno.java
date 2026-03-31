import java.util.*;

public class Missingno {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int expectedsum = n * (n + 1) / 2;
        int actualsum = 0;

        for (int num : nums) {
            actualsum += num;
        }

        System.out.println(expectedsum - actualsum);

    }
}