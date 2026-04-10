import java.util.*;

public class Movezeroes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        int j = 0; // j = 0 outside → keeps track across loop.
                   // Inside loop → resets every time → wrong.
                   // Loop runs left to right, checks condition each time
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }

        /*
         * nums = [5, 0, 3, 8], i = 2, j = 0.
         * 
         * Before swap:
         * nums[i] = 3, nums[j] = 5.
         * 
         * Step 1: temp = nums[i] → temp = 3.
         * 
         * Step 2: nums[i] = nums[j] → nums[2] = 5.
         * 
         * Step 3: nums[j] = temp → nums[0] = 3.
         * 
         * After swap:
         * nums = [3, 0, 5, 8]
         */

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }

    }

}
