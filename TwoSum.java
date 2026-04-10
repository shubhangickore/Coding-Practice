import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Target
        int target = sc.nextInt();

        // HashMap for storing (value -> index)
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                found = true;
                break;
            }

            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// HashMap<Integer, Integer> map = new HashMap<>();

// for(int i = 0; i<nums.length; i++){
// int complement = target - nums[i];

// if(map.containsKey(complement)){
// return new int[] { map.get(complement),i};
// }

// map.put(nums[i],i);
// }

// return new int[] {};
// }
// }

/*
 * - Start with empty map.
 * - For each number:
 * - Compute complement.
 * - If complement already in map → return indices (solution found).
 * - Else → store current number in map.
 * - If loop finishes with no match → return empty array.
 * 
 * ✅ Key Reminders
 * - If runs first → checks complement.
 * - Return stops method immediately → no further code runs.
 * - map.put runs only if complement not found.
 * - Braces {} group code for loop and if.
 * - Variables declared outside loop (like map) persist across iterations.
 * - Variables declared inside loop (like complement) reset each iteration.
 * 
 * 👉 So the program’s path is: loop → check complement → return if found → else
 * store → continue → after loop return empty if nothing found.
 * Would you like me to also show a dry run example (say nums = [2,7,11,15],
 * target = 9) so you can see exactly how the map builds and when the return
 * happens?
 * 
 */