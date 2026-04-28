public class PeakIndexinMountainArray {
    public static int peakIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (left - right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;

            }

            else {
                right = mid - 1;
            }
        }
        return left;

    }

    public static void main(String args[]) {
        int arr[] = { 3, 12, 4, 5 };
        System.out.println(peakIndex(arr));
    }

}
