public class SearchMatrix {
    public static boolean searchmat(int matrix[][], int target) {
        int n = matrix.length; // No. of rows
        int m = matrix[0].length; // no. of col

        // The trick in this algorithm is to flatten the 2D matrix into a virtual 1D
        // array of size n * m.
        int low = 0;
        int high = (n * m) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / m; // Division gives the row number.
            int col = mid % m; // Modulo gives the column number.

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

}
/*
 * Binary search logic (low, high, mid) is what actually moves us nearer to the
 * target.
 * 
 * The row/col conversion ensures we’re checking the right cell in the matrix
 * each time.
 * 
 * Together, they allow binary search to work seamlessly on a 2D matrix as if it
 * were a sorted 1D array.
 */