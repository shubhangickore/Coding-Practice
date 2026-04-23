import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) { // nums.length - 2 ensures there are always at least two numbers
                                                    // left after the fixed one.
                                                    // This loop is exactly the fixed number loop.
            if (i != 0 && nums[i] == nums[i - 1]) { // i != 0 → false (because i = 0
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]); // Call = actual values/variables passed in
        }

        return result;
    }

    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {// Definition = types + names of
                                                                                    // parameters to receive those
                                                                                    // values.
        int i = k, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                result.add(Arrays.asList(-target, nums[i], nums[j]));

                while (i < j && nums[i] == nums[i + 1]) { // if array has [-1, -1, -1, 2], once we use the first -1, we
                                                          // skip the other -1s before moving on.
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }
                // Move both pointers inward:It’s about continuing the search for more pairs
                // with the current fixed number.
                i++;
                j--;
            }
        }
    }
}