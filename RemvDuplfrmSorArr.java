import java.util.*;

public class RemvDuplfrmSorArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int k = i + 1; // - i tracks the index of the last unique element hence + 1.

        System.out.println(k);
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}

/*
 * nput: nums = [1,1,2,2,3]
 * 
 * Start: i=0, nums[0]=1
 * 
 * j=1: nums[1]=1 → same as nums[i] → skip
 * 
 * j=2: nums[2]=2 ≠ nums[i]=1 → i=1, nums[1]=2
 * 
 * j=3: nums[3]=2 = nums[i]=2 → skip
 * 
 * j=4: nums[4]=3 ≠ nums[i]=2 → i=2, nums[2]=3
 */