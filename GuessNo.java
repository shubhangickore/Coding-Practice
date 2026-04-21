public class GuessNo {

    // Simulated API for testing
    static int pick = 6; // the number chosen

    public static int guess(int num) {
        if (num > pick)
            return -1; // guess too high
        if (num < pick)
            return 1; // guess too low
        return 0; // correct
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(" the no is " + guessno(n));
    }

    public static int guessno(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid; // found the number
            } else if (res < 0) {
                right = mid - 1; // number is smaller
            } else {
                left = mid + 1; // number is larger
            }
        }

        return -1; // should never reach here
    }
}
