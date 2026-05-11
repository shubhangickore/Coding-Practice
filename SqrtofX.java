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

/*
 * Dry Run Example
 * Suppose x = 10.
 * 
 * left right mid mid² ans Action
 * 0 10 5 25 0 too big → right=4
 * 0 4 2 4 2 valid → ans=2, left=3
 * 3 4 3 9 3 valid → ans=3, left=4
 * 4 4 4 16 3 too big → right=3
 * 
 * 
 * Loop ends → ans = 3.
 * That’s correct since √10 ≈ 3.16, and the integer square root is 3.
 */