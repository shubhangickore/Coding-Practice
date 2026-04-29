public class SqrtofX {
    public int sqrtofX(int x) {
        long left = 0;
        long right = x;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String args[]) {
        SqrtofX sqt = new SqrtofX();
        int result = sqt.sqrtofX(5);
        System.out.println(result);
    }

}
