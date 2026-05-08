import java.util.*;

public class NextGreaterEle {
    public static int[] NextGreaterElement(int nums1[], int nums2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int result[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) // lookup answers from map

        {

            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String args[]) {
        int nums1[] = { 4, 1, 2 };
        int nums2[] = { 1, 3, 4, 2 };
        System.out.println(NextGreaterElement(nums1, nums2));

    }

}
