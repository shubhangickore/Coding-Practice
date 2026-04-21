import java.util.*;

//The Power of Two program is designed to check whether a given integer n is a power of two.
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

/*
 * example
 * | Step | n | n-1 | Binary(n) | Binary(n-1) | n & (n-1) |
 * | --- | --- | --- | --- | --- | --- |
 * | Init | 16 | 15 | 10000 | 01111 | 00000 |
 * 
 */