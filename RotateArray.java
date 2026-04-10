import java.util.*;

public class RotateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // rotation steps
        int n = sc.nextInt(); // size of array
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rotate(nums, k); // perform rotation

        System.out.println(Arrays.toString(nums)); // print rotated array
    }

    public static void rotate(int nums[], int k) {
        int n = nums.length; // get size of the array
        int temp[] = new int[n]; // create temporary array

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i]; // place each element in its rotated position

        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i]; // copy back into original array
        }
    }
}