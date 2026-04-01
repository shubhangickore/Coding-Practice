import java.util.*;

public class Maxsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

        }

        int result = maxsubarr(nums);

        System.out.println("The result of subarray with max sum" + result);

    }

    public static int maxsubarr(int[] nums) {

        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);// currSum = max(current element alone,previous sum +
                                                           // current element
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;

    }
}