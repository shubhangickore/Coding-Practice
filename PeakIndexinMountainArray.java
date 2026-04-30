public class PeakIndexinMountainArray {
    public static int peakIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // peak is on the right
            } else {
                right = mid; // peak is at mid or on the left arr[mid] >= arr[mid+1], the peak could be at
                             // mid itself
            }
        }
        return left; // or right, since left == right
    }

    public static void main(String args[]) {
        int arr[] = { 3, 12, 4, 5 };
        System.out.println(peakIndex(arr)); // Output: 1
    }
}
