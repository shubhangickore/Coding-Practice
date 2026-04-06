public class MaxProdKadane {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // If current number is negative, swap max and min
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Update max and min products
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            // Update result
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums1)); // Output: 6

        int[] nums2 = { -2, 0, -1 };
        System.out.println(maxProduct(nums2)); // Output: 0
    }
}
