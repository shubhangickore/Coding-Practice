import java.util.*;

public class SingleNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            result = result ^ num; // any no. XOR itself cancels a ^ a = 0.
        }
        System.out.println(result);
    }

}

/*
 * Input: [2, 2, 1]
 * - result = 0
 * - result ^= 2 → 0 ^ 2 = 2
 * - result ^= 2 → 2 ^ 2 = 0
 * - result ^= 1 → 0 ^ 1 = 1
 * ✅ Output = 1
 * 
 * 
 */