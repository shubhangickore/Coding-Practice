import java.util.*; //nums1 = [1,2,2,3]  nums2 = [2,2,3] it returns [2,2,3] this program ensures intersection with possible duplicates.

public class IntersectionArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int nums1[] = new int[n1];
        int nums2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersectarr(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersectarr(int nums1[], int nums2[]) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>(); // Dynamic growth

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]); // result is a List<Integer> You are adding an element to the result list
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int res[] = new int[result.size()]; // result is a dynamic list - Create a fixed-size array res of exact
                                            // length.// Copy elements from list into array.
        for (int k = 0; k < result.size(); k++) { // Return the array.
            res[k] = result.get(k); // fetch element from list Assign into array
        }

        return res;
    }
}