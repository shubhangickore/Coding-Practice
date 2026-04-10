import java.util.*;

public class MinSizeSubSum { // For minimum size subarray sum, you need to find the smallest length subarray
                             // whose sum is greater than or equal to a given target.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(minsubarr(nums, target));

    }

    public static int minsubarr(int nums[], int target) {
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;

        for (int end = 0; end < n; end++) {
            sum += nums[end];

            while (sum >= target) {
                sum -= nums[start];
                minLen = Math.min(minLen, end - start + 1);
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

}
