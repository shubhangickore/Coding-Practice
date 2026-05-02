public class SearchInsert { // This is the Search Insert Position problem, another variation of binary
                            // search. The idea is the same: since the array is sorted,
                            // we can use binary search to either find the target or determine where it
                            // should be inserted
    public static void main(String args[]) {
        int nums[] = { 1, 3, 4, 5, 6 };
        int target = 2;

        System.out.println(searchpos(nums, target));
    }

    static int searchpos(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

}
