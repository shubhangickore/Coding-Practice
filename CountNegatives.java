public class CountNegatives {
    public static int countNegatives(int[][] grid) {
        int m = grid.length; // number of rows
        int n = grid[0].length; // number of columns

        int row = m - 1; // start at bottom-left corner
        int col = 0; // first column
        int result = 0; // total count of negatives

        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                // If element is negative, then all elements to the right in this row are also
                // negative
                result += (n - col); // count all negatives in this row from current col to end
                row--; // move up to previous row
            } else {
                // If element is non-negative, move right to next column
                col++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { -3, -2, -1, 1 },
                { -2, -1, 1, 2 },
                { -1, 1, 2, 3 },
                { 1, 2, 3, 4 }
        };

        System.out.println("Count of negatives: " + countNegatives(matrix));
    }
}