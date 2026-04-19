public class Mystery {
    public static void main(String args[]) {
        int n = 0;

        System.out.println(mystry(n));

    }

    static int mystry(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        return n * 2;
    }

}
