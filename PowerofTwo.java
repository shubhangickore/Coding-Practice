import java.util.*;

public class PowerofTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powoftwo(n));
    }

    public static boolean powoftwo(int n) {

        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}