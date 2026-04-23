import java.util.*; // Needed for Arrays and Comparator

public class LargestNum {

    // Method to form the largest possible number from given integers
    public String largestnumber(int nums[]) {

        // Step 1: Convert each integer in nums[] to a String
        String[] asStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStr[i] = String.valueOf(nums[i]); // FIX: assignment was missing
        }

        // Step 2: Sort strings using custom comparator
        Arrays.sort(asStr, new Comparator<String>() {
            public int compare(String a, String b) {
                // Concatenate in both possible orders
                String order1 = a + b;
                String order2 = b + a;
                // Compare which order gives larger lexicographic value
                return order2.compareTo(order1); // FIX: typo compareYo → compareTo
            }
        });

        // Step 3: Handle case where all numbers are zero
        if (asStr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build the final largest number string
        StringBuilder largestNumStr = new StringBuilder();
        for (String str : asStr) {
            largestNumStr.append(str);
        }

        // Step 5: Return the result
        return largestNumStr.toString(); // FIX: variable name corrected
    }

    // Main method to test the program
    public static void main(String[] args) {
        LargestNum ln = new LargestNum();

        // Example input array
        int[] nums = {3, 30, 34, 5, 9};

        // Call largestnumber() and print result
        String result = ln.largestnumber(nums);
        System.out.println("Largest formed number: " + result);
    }
}
