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
/*
 * When we say the Power of Two program works with binary,
 * it doesn’t mean you have to manually give it binary numbers like 1010.
 * You can pass in normal integers like 2, 3, 16, etc. The program itself
 * automatically
 * works with the binary representation of those integers because computers
 * store and process numbers
 * in binary internally.
 */