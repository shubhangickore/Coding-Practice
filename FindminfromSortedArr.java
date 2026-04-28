public class FindminfromSortedArr {
    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findmin(nums));

    }

    public static int findmin(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Case 1: Already Sorted
            if (nums[left] <= nums[right]) {
                ans = Math.min(ans, nums[left]);
                break;
            }

            // Case 2: Left Half Sorted
            if (nums[left] <= nums[mid]) {
                ans = Math.min(ans, nums[left]);
                left = mid + 1;
            }

            // Case 3: Right Half Sorted

            else {
                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }

        }

        return ans;

    }
}