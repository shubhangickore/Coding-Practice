import java.util.*;

public class MaxProductSubArr {
    public static int maxprod(int nums[]) {

        int n = nums.length;
        double prefix = 1;
        double suffix = 1;
        double maxprod = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1]; // By writing n - i - 1, you’re dynamically shifting the index if we use [n-1]
                                       // o, you’d always multiply by the last element of the array it will never go
                                       // backward

            maxprod = Math.max(maxprod, Math.max(prefix, suffix));
        }

        return (int) maxprod;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxprod(nums));

    }

}
