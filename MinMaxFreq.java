import java.util.*;

public class MinMaxFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 1: Build frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find min and max frequency
        int minfreq = Integer.MAX_VALUE;
        int maxfreq = Integer.MIN_VALUE;

        for (int val : freq.values()) { // gives you all the counts (frequencies) of each element in the array.
            minfreq = Math.min(minfreq, val); // compares the current minfreq with the current val.(infinite, 1)
                                              // then(1,2)likewise
            maxfreq = Math.max(maxfreq, val);
        }

        // Step 3: Print results
        System.out.print("Minimum frequency element(s): ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == minfreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();

        System.out.print("Maximum frequency element(s): ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxfreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
/*
 * entry is one key-value pair from the map.
 * 
 * entrySet() lets you loop through all pairs.
 * 
 * entry.getKey() = element, entry.getValue() = frequency.
 * Each pair (key, value) is represented by a Map.Entry<K,V> object.
 * 
 * entry.getKey() → gives the key (the element itself, like 1, 2, 3).
 * 
 * entry.getValue() → gives the value (the frequency count, like 2, 3, 1).
 */