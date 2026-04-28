public class NprimeafterX {
    static boolean isPrime(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int x = 10;
        int N = 5;
        int count = 0;
        int num = x + 1;

        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

}
