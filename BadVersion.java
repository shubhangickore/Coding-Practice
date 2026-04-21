public class BadVersion {
    static int bad = 4; // simulate the first bad version

    public static void main(String args[]) {
        int n = 5;
        System.out.println("First bad version: " + FirstBadversion(n));
    }

    public static int FirstBadversion(int n) {
        int left = 1; // versions start at 1
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; // mid could be the first bad version
            } else {
                left = mid + 1; // skip good versions
            }
        }
        return left;
    }

    // Simulated API
    public static boolean isBadVersion(int version) {
        return version >= bad;
    }
}
