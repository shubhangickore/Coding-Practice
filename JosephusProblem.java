import java.util.*;

public class JosephusProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(josephus(k, n));

    }

    public static int josephus(int k, int n) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + k) % i;
        }

        return res + 1;

    }

}